INSERT INTO ACCOUNTS (CUSTOMER_NUMBER, ACCOUNT_NUMBER, PRODUCT_NUMBER, PRODUCT_NAME, STATUS, BALANCE, CREATION_DATE)
VALUES ('00000001', '000012345678', '101', 'credit_card', 'act', 15230.75, '2023-04-15');

INSERT INTO ACCOUNTS (CUSTOMER_NUMBER, ACCOUNT_NUMBER, PRODUCT_NUMBER, PRODUCT_NAME, STATUS, BALANCE, CREATION_DATE)
VALUES ('00000002', '000098765432', '102', 'debit_card', 'blq', 820.00, '2022-12-01');

INSERT INTO ACCOUNTS (CUSTOMER_NUMBER, ACCOUNT_NUMBER, PRODUCT_NUMBER, PRODUCT_NAME, STATUS, BALANCE, CREATION_DATE)
VALUES ('00000003', '000056789012', '103', 'credit_card', 'act', 4599.99, '2024-07-22');

INSERT INTO ACCOUNTS (CUSTOMER_NUMBER, ACCOUNT_NUMBER, PRODUCT_NUMBER, PRODUCT_NAME, STATUS, BALANCE, CREATION_DATE)
VALUES ('00000004', '000034567890', '104', 'debit_card', 'blq', 120.50, '2021-03-30');

INSERT INTO CARDS (ACCOUNT_NUMBER, CARD_NUMBER, CARD_TYPE, STATUS, CREATION_DATE)
VALUES ('000012345678', '4938123412345678', 'A', 'ACT', '2023-04-20');

INSERT INTO CARDS (ACCOUNT_NUMBER, CARD_NUMBER, CARD_TYPE, STATUS, CREATION_DATE)
VALUES ('000098765432', '5312987654321098', 'T', 'ACT', '2022-12-10');

INSERT INTO CARDS (ACCOUNT_NUMBER, CARD_NUMBER, CARD_TYPE, STATUS, CREATION_DATE)
VALUES ('000056789012', '4000567890123456', 'A', 'ACT', '2024-07-25');

INSERT INTO CARDS (ACCOUNT_NUMBER, CARD_NUMBER, CARD_TYPE, STATUS, CREATION_DATE)
VALUES ('000034567890', '6011345678901234', 'T', 'BLO', '2021-04-02');


