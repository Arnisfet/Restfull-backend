CREATE TABLE image (
                        id UUID DEFAULT gen_random_uuid() PRIMARY KEY,  -- UUID ensures global uniqueness
                        image BYTEA NOT NULL                            -- BYTEA for binary image data
);