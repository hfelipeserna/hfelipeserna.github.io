CREATE TABLE IF NOT EXISTS dentist(
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50),
    surname VARCHAR(50),
    professional_card VARCHAR(50),
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS patients(
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50),
    surname VARCHAR(50),
    identity_number VARCHAR(50),
    entry_date TIMESTAMP WITHOUT TIMEZONE_,
    home_address_id INT,
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS home_address(
    id INT NOT NULL AUTO_INCREMENT,
    address VARCHAR(255),
    postal_code VARCHAR(30),
    state_province_region VARCHAR(50)
    PRIMARY KEY(id)
);