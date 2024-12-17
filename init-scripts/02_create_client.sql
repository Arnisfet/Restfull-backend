CREATE TABLE client (
                        id SERIAL PRIMARY KEY,
                        client_name VARCHAR(100) NOT NULL,            -- Limiting names to 100 characters
                        client_surname VARCHAR(100) NOT NULL,
                        birthday DATE NOT NULL,                       -- DATE for birthday
                        gender CHAR(1) NOT NULL CHECK (gender IN ('M', 'F', 'O')),  -- CHAR(1) for efficient gender storage
                        registration_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        address_id INT REFERENCES address(id) ON DELETE SET NULL
);