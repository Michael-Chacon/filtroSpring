INSERT INTO country (code_country, namecountry) VALUES ("col", "Colombia")
INSERT INTO country (code_country, namecountry) VALUES ("al", "Alemania")

INSERT INTO region (codereg, namereg, codecountry) VALUES ("ad","Andina", "col")
INSERT INTO region (codereg, namereg, codecountry) VALUES ("car","Caribe", "col")

INSERT INTO city (codecity, namecity, codereg) VALUES ("buc","Bucaramanga", "ad")

INSERT INTO farmacy (namefarmacy, addressfarmacy, longf, latfarmacy, logofarmacy, codecityfarmacy) VALUES ("aaaaaaaaaaaaa", "bla bla ", 1112, 003, "", "buc")



