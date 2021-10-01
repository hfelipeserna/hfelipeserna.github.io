CREATE TABLE IF NOT EXISTS dentist (
    id INT NOT NULL AUTO_INCREMENT,
    professional_card VARCHAR(30),
    name VARCHAR(50),
    surname VARCHAR(50),

    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS home_address(
    id INT NOT NULL AUTO_INCREMENT,
    street VARCHAR(50),
    number VARCHAR(50),
    additional_information VARCHAR(50),
    city VARCHAR(50),
    province VARCHAR(50),
    postal_code VARCHAR(50)

    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS patient(
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50),
    surname VARCHAR(50),
    identity_card VARCHAR (50),
    date_of_entry TIMESTAMP WITHOUT TIMEZONE_,
    address_id INT

    PRIMARY KEY (id)
);