/* Insert lessons */
INSERT IGNORE INTO lesson(id, name) VALUES(1, "Mathematics");
INSERT IGNORE INTO lesson(id, name) VALUES(2, "Turkish");
INSERT IGNORE INTO lesson(id, name) VALUES(3, "Science");
INSERT IGNORE INTO lesson(id, name) VALUES(4, "Social Studies");
INSERT IGNORE INTO lesson(id, name) VALUES(5, "English");

/* Insert teacher */
INSERT IGNORE INTO teacher(ssn, first_name, last_name, password) VALUES(255369147, "Ezgi", "Sena", "EzgiSena123.");

/* Insert parents */
INSERT IGNORE INTO parent(ssn, first_name, last_name, password) VALUES(515475231, "Ahmet", "Demir", "Ahmet123.");
INSERT IGNORE INTO parent(ssn, first_name, last_name, password) VALUES(415786251, "İbrahim", "Özyurt", "ibrahim123");
INSERT IGNORE INTO parent(ssn, first_name, last_name, password) VALUES(952312475, "Barış", "Ağaoğlu", "baris1122.");
INSERT IGNORE INTO parent(ssn, first_name, last_name, password) VALUES(552366987, "Sena", "Sayan", "ss123456.");
INSERT IGNORE INTO parent(ssn, first_name, last_name, password) VALUES(123345882, "Elif", "Muratoğlu", "em2244");
