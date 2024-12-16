CREATE TABLE supplier (
                          id SERIAL PRIMARY KEY,
                          name VARCHAR(150) NOT NULL,         -- Name typically doesn't need more than 150 chars
                          address_id INT REFERENCES address(id) ON DELETE SET NULL,
                          phone_number VARCHAR(15)            -- Standard length for international numbers
);