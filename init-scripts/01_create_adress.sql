CREATE TABLE address (
                         id SERIAL PRIMARY KEY,
                         country VARCHAR(100) NOT NULL,  -- VARCHAR allows specific length
                         city VARCHAR(100) NOT NULL,
                         street VARCHAR(255) NOT NULL
);