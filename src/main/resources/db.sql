-- MySQL Script generated by MySQL Workbench
-- Tue Jan 26 21:54:15 2016
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema crowdcontrol
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema crowdcontrol
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `crowdcontrol` DEFAULT CHARACTER SET utf8mb4 ;
USE `crowdcontrol` ;

-- -----------------------------------------------------
-- Table `crowdcontrol`.`Algorithm_Task_Chooser`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Algorithm_Task_Chooser` (
  `id_task_chooser` VARCHAR(191) NOT NULL,
  `description` TEXT NOT NULL,
  PRIMARY KEY (`id_task_chooser`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Template`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Template` (
  `id_template` INT(11) NOT NULL AUTO_INCREMENT,
  `template` LONGTEXT NOT NULL,
  `titel` VARCHAR(191) NULL DEFAULT NULL,
  `answer_type` VARCHAR(191) NULL DEFAULT NULL,
  PRIMARY KEY (`id_template`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Algorithm_Answer_Quality`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Algorithm_Answer_Quality` (
  `id_Algorithm_Answer_Quality` VARCHAR(191) NOT NULL,
  PRIMARY KEY (`id_Algorithm_Answer_Quality`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Algorithm_Rating_Quality`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Algorithm_Rating_Quality` (
  `id_Algorithm_Rating_Quality` VARCHAR(191) NOT NULL,
  PRIMARY KEY (`id_Algorithm_Rating_Quality`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Experiment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Experiment` (
  `id_experiment` INT(11) NOT NULL AUTO_INCREMENT,
  `titel` VARCHAR(191) NULL DEFAULT NULL,
  `description` LONGTEXT NULL DEFAULT NULL,
  `needed_answers` INT NULL DEFAULT NULL,
  `ratings_per_answer` INT(11) NULL DEFAULT NULL,
  `anwers_per_worker` INT NULL DEFAULT NULL,
  `ratings_per_worker` INT NULL DEFAULT NULL,
  `answer_type` VARCHAR(191) NULL DEFAULT NULL,
  `algorithm_task_chooser` VARCHAR(191) NULL DEFAULT NULL,
  `algorithm_quality_answer` VARCHAR(191) NULL DEFAULT NULL,
  `algorithm_quality_rating` VARCHAR(191) NULL DEFAULT NULL,
  `base_payment` INT(11) NULL DEFAULT NULL,
  `bonus_answer` INT(11) NULL DEFAULT NULL,
  `bonus_rating` INT(11) NULL DEFAULT NULL,
  `template_data` MEDIUMTEXT NULL DEFAULT NULL,
  `template` INT(11) NULL DEFAULT NULL,
  `worker_quality_threshold` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id_experiment`),
  INDEX `usedTemplate_idx` (`template` ASC),
  INDEX `usedTaskChooser_idx` (`algorithm_task_chooser` ASC),
  INDEX `usedRatingQuality_idx` (`algorithm_quality_rating` ASC),
  INDEX `usedAnswerQuality_idx` (`algorithm_quality_answer` ASC),
  CONSTRAINT `usedTaskChooser`
    FOREIGN KEY (`algorithm_task_chooser`)
    REFERENCES `crowdcontrol`.`Algorithm_Task_Chooser` (`id_task_chooser`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT,
  CONSTRAINT `usedTemplate`
    FOREIGN KEY (`template`)
    REFERENCES `crowdcontrol`.`Template` (`id_template`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `usedAnswerQuality`
    FOREIGN KEY (`algorithm_quality_answer`)
    REFERENCES `crowdcontrol`.`Algorithm_Answer_Quality` (`id_Algorithm_Answer_Quality`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `usedRatingQuality`
    FOREIGN KEY (`algorithm_quality_rating`)
    REFERENCES `crowdcontrol`.`Algorithm_Rating_Quality` (`id_Algorithm_Rating_Quality`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Platform`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Platform` (
  `id_platform` VARCHAR(191) NOT NULL,
  `name` VARCHAR(191) NOT NULL,
  `render_calibrations` BIT(1) NOT NULL,
  `needs_email` BIT(1) NOT NULL,
  PRIMARY KEY (`id_platform`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Worker`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Worker` (
  `id_worker` INT(11) NOT NULL AUTO_INCREMENT,
  `identification` VARCHAR(191) NULL DEFAULT NULL,
  `platform` VARCHAR(191) NOT NULL,
  `email` VARCHAR(191) NULL DEFAULT NULL,
  PRIMARY KEY (`id_worker`),
  INDEX `workerOrigin_idx` (`platform` ASC),
  CONSTRAINT `workerOrigin`
    FOREIGN KEY (`platform`)
    REFERENCES `crowdcontrol`.`Platform` (`id_platform`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Answer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Answer` (
  `id_answer` INT(11) NOT NULL AUTO_INCREMENT,
  `experiment` INT(11) NOT NULL,
  `answer` MEDIUMTEXT NOT NULL,
  `timestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `worker_id` INT(11) NOT NULL,
  `quality` INT(11) NULL DEFAULT NULL,
  `quality_assured` BIT(1) NULL,
  PRIMARY KEY (`id_answer`),
  INDEX `workerAnswered_idx` (`worker_id` ASC),
  INDEX `idExperimentAnswers_idx` (`experiment` ASC),
  CONSTRAINT `idExperimentAnswers`
    FOREIGN KEY (`experiment`)
    REFERENCES `crowdcontrol`.`Experiment` (`id_experiment`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `workerAnswered`
    FOREIGN KEY (`worker_id`)
    REFERENCES `crowdcontrol`.`Worker` (`id_worker`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Constraint`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Constraint` (
  `id_constraint` INT(11) NOT NULL AUTO_INCREMENT,
  `constraint` VARCHAR(45) NOT NULL,
  `experiment` INT(11) NOT NULL,
  PRIMARY KEY (`id_constraint`),
  INDEX `constrainedExperiment` (`experiment` ASC),
  CONSTRAINT `constrainedExperiment`
    FOREIGN KEY (`experiment`)
    REFERENCES `crowdcontrol`.`Experiment` (`id_experiment`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Population`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Population` (
  `id_population` INT(11) NOT NULL AUTO_INCREMENT,
  `property` VARCHAR(191) NOT NULL,
  `description` TEXT NULL DEFAULT NULL,
  `name` VARCHAR(191) NOT NULL,
  `experiment` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id_population`),
  UNIQUE INDEX `experiment_UNIQUE` (`experiment` ASC),
  CONSTRAINT `participatedIn`
    FOREIGN KEY (`experiment`)
    REFERENCES `crowdcontrol`.`Experiment` (`id_experiment`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Population_answer_option`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Population_answer_option` (
  `id_population_answer_option` INT(11) NOT NULL AUTO_INCREMENT,
  `population` INT(11) NOT NULL,
  `answer` VARCHAR(191) NOT NULL,
  PRIMARY KEY (`id_population_answer_option`),
  INDEX `populationAnswer_idx` (`population` ASC),
  CONSTRAINT `populationAnswer`
    FOREIGN KEY (`population`)
    REFERENCES `crowdcontrol`.`Population` (`id_population`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`ExperimentsPopulation`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`ExperimentsPopulation` (
  `id_experiments_population` VARCHAR(191) NOT NULL,
  `population_user` INT(11) NOT NULL,
  `answer` INT(11) NOT NULL,
  `referenced_platform` VARCHAR(191) NOT NULL,
  `not` BIT(1) NOT NULL,
  PRIMARY KEY (`id_experiments_population`),
  INDEX `populationUser_idx` (`population_user` ASC),
  INDEX `referencedPlatform_idx` (`referenced_platform` ASC),
  INDEX `referencedAnswer_idx` (`answer` ASC),
  CONSTRAINT `populationUser`
    FOREIGN KEY (`population_user`)
    REFERENCES `crowdcontrol`.`Experiment` (`id_experiment`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `referencedAnswer`
    FOREIGN KEY (`answer`)
    REFERENCES `crowdcontrol`.`Population_answer_option` (`id_population_answer_option`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `referencedPlatform`
    FOREIGN KEY (`referenced_platform`)
    REFERENCES `crowdcontrol`.`Platform` (`id_platform`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Gift_Code`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Gift_Code` (
  `id_gift_code` INT(11) NOT NULL AUTO_INCREMENT,
  `code` MEDIUMTEXT NOT NULL,
  `amount` INT(11) NOT NULL,
  PRIMARY KEY (`id_gift_code`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Notification`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Notification` (
  `id_notification` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `description` TEXT NOT NULL,
  `checkPeriod` INT(11) NOT NULL,
  `sendThreshold` INT(11) NOT NULL,
  `query` MEDIUMTEXT NOT NULL,
  `lastSent` TIMESTAMP NULL DEFAULT NULL,
  PRIMARY KEY (`id_notification`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Population_Result`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Population_Result` (
  `id_population_result` INT(11) NOT NULL AUTO_INCREMENT,
  `worker` INT(11) NOT NULL,
  `answer` INT(11) NOT NULL,
  PRIMARY KEY (`id_population_result`),
  INDEX `referencedAnswer_idx` (`answer` ASC),
  INDEX `referencedWorker_idx` (`worker` ASC),
  CONSTRAINT `chosenAnswer`
    FOREIGN KEY (`answer`)
    REFERENCES `crowdcontrol`.`Population_answer_option` (`id_population_answer_option`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `referencedWorker`
    FOREIGN KEY (`worker`)
    REFERENCES `crowdcontrol`.`Worker` (`id_worker`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Rating`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Rating` (
  `id_rating` INT(11) NOT NULL AUTO_INCREMENT,
  `experiment` INT(11) NOT NULL,
  `answer_r` INT(11) NOT NULL,
  `timestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `rating` INT(11) NULL DEFAULT NULL,
  `feedback` TEXT NULL,
  `worker_id` INT(11) NOT NULL,
  `quality` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id_rating`),
  INDEX `idAnswers_idx` (`answer_r` ASC),
  INDEX `workerRated_idx` (`worker_id` ASC),
  INDEX `idExperimentRating_idx` (`experiment` ASC),
  CONSTRAINT `idAnswersratins`
    FOREIGN KEY (`answer_r`)
    REFERENCES `crowdcontrol`.`Answer` (`id_answer`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `idExperimentRating`
    FOREIGN KEY (`experiment`)
    REFERENCES `crowdcontrol`.`Experiment` (`id_experiment`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `workerRated`
    FOREIGN KEY (`worker_id`)
    REFERENCES `crowdcontrol`.`Worker` (`id_worker`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Tag`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Tag` (
  `id_tag` INT(11) NOT NULL AUTO_INCREMENT,
  `tag` VARCHAR(191) NOT NULL,
  `experiment` INT(11) NOT NULL,
  PRIMARY KEY (`id_tag`),
  INDEX `idexperiment_idx` (`experiment` ASC),
  CONSTRAINT `idexperimenttags`
    FOREIGN KEY (`experiment`)
    REFERENCES `crowdcontrol`.`Experiment` (`id_experiment`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Task`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Task` (
  `id_task` INT(11) NOT NULL AUTO_INCREMENT,
  `experiment` INT(11) NOT NULL,
  `platform_data` MEDIUMTEXT NULL DEFAULT NULL,
  `crowd_platform` VARCHAR(191) NOT NULL,
  `status` ENUM('running', 'finished', 'stopping', 'stopped') NOT NULL,
  `stopgap` ENUM('answer', 'rating', 'disabled') NOT NULL DEFAULT 'disabled',
  PRIMARY KEY (`id_task`),
  INDEX `idexperiment_idx` (`experiment` ASC),
  INDEX `runningOnPlattform_idx` (`crowd_platform` ASC),
  CONSTRAINT `idexperimenthit`
    FOREIGN KEY (`experiment`)
    REFERENCES `crowdcontrol`.`Experiment` (`id_experiment`),
  CONSTRAINT `runningOnPlattform`
    FOREIGN KEY (`crowd_platform`)
    REFERENCES `crowdcontrol`.`Platform` (`id_platform`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Worker_Balance`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Worker_Balance` (
  `id_worker_balance` INT NOT NULL AUTO_INCREMENT,
  `transaction_value` INT NOT NULL,
  `worker` INT NOT NULL,
  `experiment` INT NOT NULL,
  `gift_code` INT NULL,
  `type` ENUM('debit', 'credit') NOT NULL,
  `timestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_worker_balance`),
  INDEX `transaction_partner_idx` (`worker` ASC),
  INDEX `used_gift_code_idx` (`gift_code` ASC),
  CONSTRAINT `transaction_partner`
    FOREIGN KEY (`worker`)
    REFERENCES `crowdcontrol`.`Worker` (`id_worker`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT,
  CONSTRAINT `used_gift_code`
    FOREIGN KEY (`gift_code`)
    REFERENCES `crowdcontrol`.`Gift_Code` (`id_gift_code`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Rating_Option_Template`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Rating_Option_Template` (
  `id_rating_options_template` INT NOT NULL AUTO_INCREMENT,
  `name` TEXT NOT NULL,
  `value` INT NOT NULL,
  `template` INT NOT NULL,
  PRIMARY KEY (`id_rating_options_template`),
  INDEX `referenced_template_idx` (`template` ASC),
  CONSTRAINT `referenced_template`
    FOREIGN KEY (`template`)
    REFERENCES `crowdcontrol`.`Template` (`id_template`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Rating_Option_Experiment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Rating_Option_Experiment` (
  `id_Rating_Option_Experiment` INT NOT NULL AUTO_INCREMENT,
  `name` TEXT NOT NULL,
  `value` INT NOT NULL,
  `experiment` INT NOT NULL,
  PRIMARY KEY (`id_Rating_Option_Experiment`),
  INDEX `rating_options_experiment_reference_idx` (`experiment` ASC),
  CONSTRAINT `rating_options_experiment_reference`
    FOREIGN KEY (`experiment`)
    REFERENCES `crowdcontrol`.`Experiment` (`id_experiment`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Algorithm_Task_Chooser_Param`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Algorithm_Task_Chooser_Param` (
  `id_Algorithm_Task_Chooser_Param` INT NOT NULL AUTO_INCREMENT,
  `description` TEXT NOT NULL,
  `regex` VARCHAR(191) NOT NULL,
  `algorithm` VARCHAR(191) NOT NULL,
  `data` VARCHAR(191) NULL,
  PRIMARY KEY (`id_Algorithm_Task_Chooser_Param`),
  INDEX `referencedTaskChooser_idx` (`algorithm` ASC),
  CONSTRAINT `referencedTaskChooser`
    FOREIGN KEY (`algorithm`)
    REFERENCES `crowdcontrol`.`Algorithm_Task_Chooser` (`id_task_chooser`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Chosen_Task_Chooser_Param`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Chosen_Task_Chooser_Param` (
  `id_Choosen_Task_Chooser_Param` INT NOT NULL AUTO_INCREMENT,
  `value` VARCHAR(191) NOT NULL,
  `experiment` INT NOT NULL,
  `param` INT NOT NULL,
  PRIMARY KEY (`id_Choosen_Task_Chooser_Param`),
  INDEX `taskChooserParamRefExperiment_idx` (`experiment` ASC),
  INDEX `choosenTaskChooserPAram_idx` (`param` ASC),
  CONSTRAINT `taskChooserParamRefExperiment`
    FOREIGN KEY (`experiment`)
    REFERENCES `crowdcontrol`.`Experiment` (`id_experiment`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `choosenTaskChooserPAram`
    FOREIGN KEY (`param`)
    REFERENCES `crowdcontrol`.`Algorithm_Task_Chooser_Param` (`id_Algorithm_Task_Chooser_Param`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Algorithm_Answer_Quality_Param`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Algorithm_Answer_Quality_Param` (
  `id_Algorithm_Answer_Quality_Param` INT NOT NULL AUTO_INCREMENT,
  `description` TEXT NOT NULL,
  `regex` VARCHAR(191) NOT NULL,
  `algorithm` VARCHAR(191) NOT NULL,
  `data` VARCHAR(191) NULL,
  PRIMARY KEY (`id_Algorithm_Answer_Quality_Param`),
  INDEX `referencedAnswerQuality_idx` (`algorithm` ASC),
  CONSTRAINT `referencedAnswerQuality`
    FOREIGN KEY (`algorithm`)
    REFERENCES `crowdcontrol`.`Algorithm_Answer_Quality` (`id_Algorithm_Answer_Quality`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Chosen_Answer_Quality_Param`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Chosen_Answer_Quality_Param` (
  `id_Algorithm_Answer_Quality_Param_Chosen` INT NOT NULL AUTO_INCREMENT,
  `value` VARCHAR(191) NOT NULL,
  `experiment` INT NOT NULL,
  `param` INT NOT NULL,
  PRIMARY KEY (`id_Algorithm_Answer_Quality_Param_Chosen`),
  INDEX `chosenAnswerQualityParam_idx` (`param` ASC),
  INDEX `answerQualityParamRefExperiment_idx` (`experiment` ASC),
  CONSTRAINT `chosenAnswerQualityParam`
    FOREIGN KEY (`param`)
    REFERENCES `crowdcontrol`.`Algorithm_Answer_Quality_Param` (`id_Algorithm_Answer_Quality_Param`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `answerQualityParamRefExperiment`
    FOREIGN KEY (`experiment`)
    REFERENCES `crowdcontrol`.`Experiment` (`id_experiment`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Algorithm_Rating_Quality_Param`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Algorithm_Rating_Quality_Param` (
  `id_Algorithm_Rating_Quality_Param` INT NOT NULL AUTO_INCREMENT,
  `description` TEXT NOT NULL,
  `regex` VARCHAR(191) NOT NULL,
  `algorithm` VARCHAR(191) NOT NULL,
  `data` VARCHAR(191) NULL,
  PRIMARY KEY (`id_Algorithm_Rating_Quality_Param`),
  INDEX `regerencedRatinQuality_idx` (`algorithm` ASC),
  CONSTRAINT `regerencedRatinQuality`
    FOREIGN KEY (`algorithm`)
    REFERENCES `crowdcontrol`.`Algorithm_Rating_Quality` (`id_Algorithm_Rating_Quality`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Chosen_Rating_Quality_Param`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Chosen_Rating_Quality_Param` (
  `id_Algorithm_Rating_Quality_Chosen` INT NOT NULL AUTO_INCREMENT,
  `value` VARCHAR(191) NOT NULL,
  `experiment` INT NOT NULL,
  `param` INT NOT NULL,
  PRIMARY KEY (`id_Algorithm_Rating_Quality_Chosen`),
  INDEX `chosenRatingQualityParam_idx` (`param` ASC),
  INDEX `chosenRatingQualityParamRefExperiment_idx` (`experiment` ASC),
  CONSTRAINT `chosenRatingQualityParam`
    FOREIGN KEY (`param`)
    REFERENCES `crowdcontrol`.`Algorithm_Rating_Quality_Param` (`id_Algorithm_Rating_Quality_Param`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `chosenRatingQualityParamRefExperiment`
    FOREIGN KEY (`experiment`)
    REFERENCES `crowdcontrol`.`Experiment` (`id_experiment`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;

USE `crowdcontrol`;

DELIMITER $$
USE `crowdcontrol`$$
CREATE DEFINER = CURRENT_USER TRIGGER `crowdcontrol`.`Platform_BEFORE_INSERT` BEFORE INSERT ON `Platform` FOR EACH ROW
BEGIN
    SET NEW.id_platform = LOWER(NEW.id_platform);
    
	IF (NEW.id_platform REGEXP '^[a-z0-9_]+$') = 0 THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = "id_platform does not match regex";
	END IF;
END$$

USE `crowdcontrol`$$
CREATE DEFINER = CURRENT_USER TRIGGER `crowdcontrol`.`Chosen_Task_Chooser_Param` BEFORE INSERT ON `Chosen_Task_Chooser_Param` FOR EACH ROW
BEGIN
	DECLARE msg VARCHAR(191);
	DECLARE checkregex VARCHAR(191);
	SELECT regex FROM Algorithm_Task_Chooser_Param WHERE id_Algorithm_Task_Chooser_Param = NEW.param INTO checkregex;
		
	IF (NEW.value REGEXP checkregex) = 0 THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = "Chosen_Task_Chooser_Param.value does not match regex";
	END IF;
END$$

USE `crowdcontrol`$$
CREATE DEFINER = CURRENT_USER TRIGGER `crowdcontrol`.`Algorithm_Answer_Quality_Param_Chosen_BEFORE_INSERT` BEFORE INSERT ON `Chosen_Answer_Quality_Param` FOR EACH ROW
BEGIN
	DECLARE msg VARCHAR(191);
	DECLARE checkregex VARCHAR(191);
	SELECT regex FROM Algorithm_Answer_Quality_Param WHERE id_Algorithm_Answer_Quality_Param = NEW.param INTO checkregex;
	
	IF (NEW.value REGEXP checkregex) = 0 THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = "Chosen_Answer_Quality_Param.value does not match regex";
	END IF;
END$$

USE `crowdcontrol`$$
CREATE DEFINER = CURRENT_USER TRIGGER `crowdcontrol`.`Algorithm_Rating_Quality_Param_Chosen_BEFORE_INSERT` BEFORE INSERT ON `Chosen_Rating_Quality_Param` FOR EACH ROW
BEGIN
	DECLARE msg VARCHAR(191);
	DECLARE checkregex VARCHAR(191);
	SELECT regex FROM Algorithm_Rating_Quality_Param WHERE id_Algorithm_Rating_Quality_Param = NEW.param INTO checkregex;
	
	IF (NEW.value REGEXP checkregex) = 0 THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = "Chosen_Rating_Quality_Param.value does not match regex";
	END IF;
END$$


DELIMITER ;
