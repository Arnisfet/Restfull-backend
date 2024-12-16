CREATE TABLE product (
                         id SERIAL PRIMARY KEY,
                         name VARCHAR(200) NOT NULL,                   -- Product name rarely exceeds 200 characters
                         category VARCHAR(100) NOT NULL,               -- Logical to limit category size
                         price NUMERIC(12, 2) NOT NULL CHECK (price >= 0),  -- NUMERIC for precise decimal storage
                         available_stock INT NOT NULL CHECK (available_stock >= 0),  -- INT for stock quantity
                         last_update_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                         supplier_id INT REFERENCES supplier(id) ON DELETE SET NULL,
                         image_id UUID REFERENCES images(id) ON DELETE SET NULL
);