USE PhoneBook;
INSERT INTO Users(avatar_url, date_of_birth, email, firstname, lastname, password) VALUES
   ('', '2000-01-01', 'email@email.com', 'Jean', 'Michel', 'jean'),
   ('', '1995-05-05', 'mail@mail.fr', 'Raoul', 'Martin', 'raoul');

INSERT INTO Contacts(avatar_url, date_of_birth, firstname, lastname, company_name, job_title, nickname, notes, user_id) VALUES
   ('https://randomuser.me/api/portraits/women/79.jpg', '1993-04-12', 'John', 'Doe',
    'Acme Corporation', 'Marketing Manager', 'Johnny', 'Met at conference last year', 1),
   ('https://randomuser.me/api/portraits/men/75.jpg', '1988-08-23', 'Jane', 'Doe',
    'XYZ Company', 'Software Developer', 'Jenny', 'Potential recruit for our team', 2),
   ('https://randomuser.me/api/portraits/women/68.jpg', '1990-05-15', 'Bob', 'Smith',
    'Big Corporation Inc.', 'CEO', 'Bobby', 'Highly influential in industry', 2),
   ('https://randomuser.me/api/portraits/men/54.jpg', '1975-09-30', 'Sarah', 'Lee',
    'Small Business LLC', 'Graphic Designer', 'Sara', 'Good collaborator on past projects', 1),
   ('https://randomuser.me/api/portraits/women/81.jpg', '1983-11-21', 'Jack', 'Chen',
    'New Venture Partners', 'Investor', 'JC', 'Interested in funding our startup', 2);

INSERT INTO PhoneBook.addresses
(identifier, city, complement, number, road_name, road_prefix, zip_code, contact_id)
VALUES
    ('Home', 'New York', 'Apt. 101', '123', 'Main Street', 'North', '10001', 1),
    ('Office', 'Los Angeles', 'Suite 200', '456', 'Wilshire Boulevard', 'West', '90001', 1),
    ('Summer House', 'Miami', 'Villa 5', '789', 'Ocean Drive', 'South', '33010', 2),
    ('Parents House', 'Chicago', 'Second Floor', '246', 'State Street', 'North', '60601', 3);

INSERT INTO PhoneBook.role(name) VALUES
    ('USER'), ('ADMIN');

