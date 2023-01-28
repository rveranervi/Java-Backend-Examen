INSERT INTO `speciality` (`spec_name`, `spec_status`) VALUES ('Cardiología', true);
INSERT INTO `speciality` (`spec_name`, `spec_status`) VALUES ('Gastroenterología', true);
INSERT INTO `speciality` (`spec_name`, `spec_status`) VALUES ('Neumología', true);
INSERT INTO `speciality` (`spec_name`, `spec_status`) VALUES ('Neurología', true);
INSERT INTO `speciality` (`spec_name`, `spec_status`) VALUES ('Pediatría', true);
INSERT INTO `speciality` (`spec_name`, `spec_status`) VALUES ('Psiquiatría', true);

INSERT INTO `doctor` (`doct_lastname`, `doct_name`, `doct_spec_id`, `doct_status`) VALUES ('Sacravilca', 'Angelica', 1, true);
INSERT INTO `doctor` (`doct_lastname`, `doct_name`, `doct_spec_id`, `doct_status`) VALUES ('Romero', 'Mario', 2, true);
INSERT INTO `doctor` (`doct_lastname`, `doct_name`, `doct_spec_id`, `doct_status`) VALUES ('Nervi', 'Juana', 3, true);
INSERT INTO `doctor` (`doct_lastname`, `doct_name`, `doct_spec_id`, `doct_status`) VALUES ('Marticorena', 'Mariana', 4, true);
INSERT INTO `doctor` (`doct_lastname`, `doct_name`, `doct_spec_id`, `doct_status`) VALUES ('Tucto', 'Mariana', 5, true);
INSERT INTO `doctor` (`doct_lastname`, `doct_name`, `doct_spec_id`, `doct_status`) VALUES ('Aguilar', 'Juana', 6, true);
INSERT INTO `doctor` (`doct_lastname`, `doct_name`, `doct_spec_id`, `doct_status`) VALUES ('De la Cruz', 'Mario', 1, true);
INSERT INTO `doctor` (`doct_lastname`, `doct_name`, `doct_spec_id`, `doct_status`) VALUES ('Aguilar', 'Mario', 2, true);
INSERT INTO `doctor` (`doct_lastname`, `doct_name`, `doct_spec_id`, `doct_status`) VALUES ('Vera', 'Juana', 3, true);
INSERT INTO `doctor` (`doct_lastname`, `doct_name`, `doct_spec_id`, `doct_status`) VALUES ('De la Cruz', 'Pascual', 4, true);
INSERT INTO `doctor` (`doct_lastname`, `doct_name`, `doct_spec_id`, `doct_status`) VALUES ('Marticorena', 'Javier', 5, true);
INSERT INTO `doctor` (`doct_lastname`, `doct_name`, `doct_spec_id`, `doct_status`) VALUES ('Aguilar', 'Pablo', 6, true);

INSERT INTO `patient` (`pati_lastname`, `pati_name`) VALUES ('Ana', 'Vasquez Beltran');
INSERT INTO `patient` (`pati_lastname`, `pati_name`) VALUES ('Ruben', 'Alcides Gomez');
INSERT INTO `patient` (`pati_lastname`, `pati_name`) VALUES ('Betty', 'Venites Castro');
INSERT INTO `patient` (`pati_lastname`, `pati_name`) VALUES ('Carlos', 'Alvarez Chacon');
INSERT INTO `patient` (`pati_lastname`, `pati_name`) VALUES ('Dennis', 'Robles Llanos');
INSERT INTO `patient` (`pati_lastname`, `pati_name`) VALUES ('Elena', 'Juarez Sanchez');
INSERT INTO `patient` (`pati_lastname`, `pati_name`) VALUES ('Fernanda', 'Vasquez Quirinto');
INSERT INTO `patient` (`pati_lastname`, `pati_name`) VALUES ('Gaby', 'Portal Paredes');
INSERT INTO `patient` (`pati_lastname`, `pati_name`) VALUES ('Hilda', 'Mendez Galvez');
INSERT INTO `patient` (`pati_lastname`, `pati_name`) VALUES ('Ivan', 'Vilchez Moncada');
INSERT INTO `patient` (`pati_lastname`, `pati_name`) VALUES ('Janery', 'Nuñez Ariasta');
INSERT INTO `patient` (`pati_lastname`, `pati_name`) VALUES ('Kiara', 'Donalds Alcides');

INSERT INTO `sermed`.`appointment` (`appo_date`, `appo_hour`, `appo_status`, `appo_doctor`, `appo_patient`) VALUES ('2022-01-28', '10:30', '1', '1', '1');
INSERT INTO `sermed`.`appointment` (`appo_date`, `appo_hour`, `appo_status`, `appo_doctor`, `appo_patient`) VALUES ('2022-01-28', '10:30', '1', '2', '1');
INSERT INTO `sermed`.`appointment` (`appo_date`, `appo_hour`, `appo_status`, `appo_doctor`, `appo_patient`) VALUES ('2022-01-28', '10:30', '1', '3', '1');
INSERT INTO `sermed`.`appointment` (`appo_date`, `appo_hour`, `appo_status`, `appo_doctor`, `appo_patient`) VALUES ('2022-01-28', '10:30', '1', '4', '1');
INSERT INTO `sermed`.`appointment` (`appo_date`, `appo_hour`, `appo_status`, `appo_doctor`, `appo_patient`) VALUES ('2022-01-28', '10:30', '1', '5', '2');
INSERT INTO `sermed`.`appointment` (`appo_date`, `appo_hour`, `appo_status`, `appo_doctor`, `appo_patient`) VALUES ('2022-01-28', '10:30', '1', '1', '3');
INSERT INTO `sermed`.`appointment` (`appo_date`, `appo_hour`, `appo_status`, `appo_doctor`, `appo_patient`) VALUES ('2022-01-28', '10:30', '1', '6', '4');
INSERT INTO `sermed`.`appointment` (`appo_date`, `appo_hour`, `appo_status`, `appo_doctor`, `appo_patient`) VALUES ('2022-01-28', '10:30', '1', '6', '1');
INSERT INTO `sermed`.`appointment` (`appo_date`, `appo_hour`, `appo_status`, `appo_doctor`, `appo_patient`) VALUES ('2022-01-28', '10:30', '1', '11', '11');
INSERT INTO `sermed`.`appointment` (`appo_date`, `appo_hour`, `appo_status`, `appo_doctor`, `appo_patient`) VALUES ('2022-01-28', '10:30', '1', '12', '12');
INSERT INTO `sermed`.`appointment` (`appo_date`, `appo_hour`, `appo_status`, `appo_doctor`, `appo_patient`) VALUES ('2022-01-28', '10:30', '1', '10', '10');
INSERT INTO `sermed`.`appointment` (`appo_date`, `appo_hour`, `appo_status`, `appo_doctor`, `appo_patient`) VALUES ('2022-01-28', '10:30', '1', '9', '3');
INSERT INTO `sermed`.`appointment` (`appo_date`, `appo_hour`, `appo_status`, `appo_doctor`, `appo_patient`) VALUES ('2022-01-28', '10:30', '1', '9', '4');
INSERT INTO `sermed`.`appointment` (`appo_date`, `appo_hour`, `appo_status`, `appo_doctor`, `appo_patient`) VALUES ('2022-01-28', '10:30', '1', '8', '5');
INSERT INTO `sermed`.`appointment` (`appo_date`, `appo_hour`, `appo_status`, `appo_doctor`, `appo_patient`) VALUES ('2022-01-28', '10:30', '1', '7', '6');
INSERT INTO `sermed`.`appointment` (`appo_date`, `appo_hour`, `appo_status`, `appo_doctor`, `appo_patient`) VALUES ('2022-01-28', '10:30', '1', '1', '7');
INSERT INTO `sermed`.`appointment` (`appo_date`, `appo_hour`, `appo_status`, `appo_doctor`, `appo_patient`) VALUES ('2022-01-28', '10:30', '1', '1', '8');
INSERT INTO `sermed`.`appointment` (`appo_date`, `appo_hour`, `appo_status`, `appo_doctor`, `appo_patient`) VALUES ('2022-01-28', '10:30', '1', '12', '9');
INSERT INTO `sermed`.`appointment` (`appo_date`, `appo_hour`, `appo_status`, `appo_doctor`, `appo_patient`) VALUES ('2022-01-28', '10:30', '1', '10', '11');
INSERT INTO `sermed`.`appointment` (`appo_date`, `appo_hour`, `appo_status`, `appo_doctor`, `appo_patient`) VALUES ('2022-01-28', '10:30', '1', '9', '4');
INSERT INTO `sermed`.`appointment` (`appo_date`, `appo_hour`, `appo_status`, `appo_doctor`, `appo_patient`) VALUES ('2022-01-28', '10:30', '1', '2', '9');




