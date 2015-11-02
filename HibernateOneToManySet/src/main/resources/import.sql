CREATE TABLE `department` (
    `department_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `dept_name` VARCHAR(50) NOT NULL DEFAULT '0',
    PRIMARY KEY (`department_id`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
ROW_FORMAT=DEFAULT
AUTO_INCREMENT=115
 
 
 
CREATE TABLE `employee` (
    `employee_id` BIGINT(10) NOT NULL AUTO_INCREMENT,
    `firstname` VARCHAR(50) NULL DEFAULT NULL,
    `lastname` VARCHAR(50) NULL DEFAULT NULL,
    `birth_date` DATE NULL DEFAULT NULL,
    `cell_phone` VARCHAR(15) NULL DEFAULT NULL,
    `department_id` BIGINT(20) NULL DEFAULT NULL,
    PRIMARY KEY (`employee_id`),
    INDEX `FK_DEPT` (`department_id`),
    CONSTRAINT `FK_DEPT` FOREIGN KEY (`department_id`) REFERENCES `department` (`department_id`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
ROW_FORMAT=DEFAULT