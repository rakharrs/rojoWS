INSERT INTO Action VALUES
    ('DREB', 'Defensive Rebound'),
    ('OREB', 'Offensive Rebound'),
    ('PF', 'Player Fool'),
    ('AST', 'Assist'),
    ('BLK', 'Block'),
    ('STL', 'Steal'),
    ('2FGM', '2 Points Field Goal Made'),
    ('2FGA', '2 Points Field Goal Attempted'), 
    ('3FGM', '3 Points Field Goal Made'),
    ('3FGA', '3 Points Field Goal Attempted'), 
    ('FTA', 'Free Throws Attempted'), 
    ('FTM', 'Free Throws Made'), 
    ('TOV', 'Turn Over');

INSERT INTO Franchise(id, franchise_name, siege)
VALUES
    ('FRCH0001', 'Lakers', 'Los Angeles'),
    ('FRCH0002', 'Celtics', 'Boston');
-- Players for the Lakers
INSERT INTO Player (id, last_name, first_name, birthdate)
VALUES
  ('PLAY0001', 'James', 'LeBron', '1984-12-30'),
  ('PLAY0002', 'Davis', 'Anthony', '1993-03-11'),
  ('PLAY0003', 'Howard', 'Dwight', '1985-12-08'),
  ('PLAY0004', 'Schroder', 'Dennis', '1993-09-15'),
  ('PLAY0005', 'Kuzma', 'Kyle', '1995-07-24'),
  ('PLAY0006', 'Caldwell-Pope', 'Kentavious', '1993-02-18'),
  ('PLAY0007', 'Harrell', 'Montrezl', '1994-01-26'),
  ('PLAY0008', 'Gasol', 'Marc', '1985-01-29'),
  ('PLAY0009', 'Caruso', 'Alex', '1994-02-28'),
  ('PLAY0010', 'Horton-Tucker', 'Talen', '2000-11-25');

-- Players for the Celtics
INSERT INTO Player (id, last_name, first_name, birthdate)
VALUES
  ('PLAY0011', 'Tatum', 'Jayson', '1998-03-03'),
  ('PLAY0012', 'Walker', 'Kemba', '1990-05-08'),
  ('PLAY0013', 'Brown', 'Jaylen', '1996-10-24'),
  ('PLAY0014', 'Smart', 'Marcus', '1994-03-06'),
  ('PLAY0015', 'Williams', 'Robert', '1997-10-17'),
  ('PLAY0016', 'Pritchard', 'Payton', '1998-01-28'),
  ('PLAY0017', 'Langford', 'Romeo', '1999-10-25'),
  ('PLAY0018', 'Thompson', 'Tristan', '1991-03-13'),
  ('PLAY0019', 'Ojeleye', 'Semi', '1994-12-05'),
  ('PLAY0020', 'Williams', 'Grant', '1998-11-30');

-- Inserting data into the Season table
INSERT INTO Season (id, type_season, season_debut, season_end)
VALUES
  ('SEASON0001', 'Regular', '2022-10-19', '2023-04-10'),
  ('SEASON0002', 'Playoffs', '2023-04-15', '2023-06-18'),
  ('SEASON0003', 'Preseason', '2022-10-01', '2022-10-15'),
  ('SEASON0004', 'Regular', '2021-12-22', '2022-04-10'),
  ('SEASON0005', 'Playoffs', '2022-04-16', '2022-06-20');

-- Inserting data into the Player_franchise table
INSERT INTO Player_franchise (id, id_player, date_arrivee, id_franchise)
VALUES
  ('1', 'PLAY0001', '2018-07-01', 'FRCH0001'),  -- LeBron James to Lakers
  ('2', 'PLAY0002', '2019-07-06', 'FRCH0001'),  -- Anthony Davis to Lakers
  ('3', 'PLAY0011', '2017-06-19', 'FRCH0002'), -- Jayson Tatum to Celtics
  ('4', 'PLAY0012', '2019-07-06', 'FRCH0002'), -- Kemba Walker to Celtics
  ('5', 'PLAY0003', '2020-11-30', 'FRCH0001'),  -- Dwight Howard return to Lakers
  ('6', 'PLAY0013', '2016-06-23', 'FRCH0002'), -- Jaylen Brown to Celtics
  ('7', 'PLAY0014', '2014-07-10', 'FRCH0002'), -- Marcus Smart to Celtics
  ('8', 'PLAY0004', '2020-11-22', 'FRCH0001'),  -- Dennis Schroder to Lakers
  ('9', 'PLAY0015', '2019-07-17', 'FRCH0002'), -- Robert Williams to Celtics
  ('10', 'PLAY0005', '2017-06-22', 'FRCH0001'); -- Kyle Kuzma to Lakers

-- Inserting data into the Game table
INSERT INTO Game (id, id_franchise1, id_franchise2, id_season)
VALUES
  ('GAME0001', 'FRCH0001', 'FRCH0002', 'SEASON0001'),  -- Lakers vs. Celtics in Season 1
  ('GAME0002', 'FRCH0002', 'FRCH0001', 'SEASON0001'),  -- Celtics vs. Lakers in Season 1
  ('GAME0003', 'FRCH0001', 'FRCH0002', 'SEASON0002'),  -- Lakers vs. Celtics in Season 2
  ('GAME0004', 'FRCH0002', 'FRCH0001', 'SEASON0002'),  -- Celtics vs. Lakers in Season 2
  ('GAME0005', 'FRCH0001', 'FRCH0002', 'SEASON0003');  -- Lakers vs. Celtics in Season 3
