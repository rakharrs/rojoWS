CREATE DATABASE basket;
\C basket

   CREATE TABLE Player(
      id VARCHAR(50) ,
      last_name VARCHAR(50)  NOT NULL,
      first_name VARCHAR(50)  NOT NULL,
      birthdate TIME NOT NULL,
      PRIMARY KEY(id)
   );

   CREATE TABLE Franchise(
      id VARCHAR(50) ,
      franchise_name VARCHAR(50) ,
      siege VARCHAR(50)  NOT NULL,
      PRIMARY KEY(id)
   );

   CREATE TABLE Season(
      id VARCHAR(50) ,
      type_season VARCHAR(50) ,
      season_debut DATE NOT NULL,
      season_end DATE NOT NULL,d
      PRIMARY KEY(id)
   );

   CREATE TABLE Role(
      id VARCHAR(50) ,
      role_name VARCHAR(50)  NOT NULL,
      id_player VARCHAR(50)  NOT NULL,
      PRIMARY KEY(id),
      FOREIGN KEY(id_player) REFERENCES Player(id)
   );

   CREATE TABLE Action(
      sigle VARCHAR(50) ,
      action_name VARCHAR(50) ,
      action_value INTEGER,
      PRIMARY KEY(sigle)
   );

   CREATE TABLE Game(   
      id_game VARCHAR(50) ,
      game_start TIMESTAMP NOT NULL,
      game_end TIMESTAMP NOT NULL,
      franchise_1 VARCHAR(50) REFERENCES Franchise(id_franchise),
      franchise_2 VARCHAR(50) REFERENCES Franchise(id_franchise),
      id_saison VARCHAR(50)  NOT NULL,
      PRIMARY KEY(id_game),
      FOREIGN KEY(id_saison) REFERENCES Season(id_saison)
   );

   CREATE TABLE Statistics(
      id_action VARCHAR(50) ,
      id_player VARCHAR(50)  NOT NULL,
      id_game VARCHAR(50)  NOT NULL,
      sigle VARCHAR(50)  NOT NULL,
      PRIMARY KEY(id_action),
      FOREIGN KEY(id_player) REFERENCES Player(id_player),
      FOREIGN KEY(id_game) REFERENCES Game(id_game),
      FOREIGN KEY(sigle) REFERENCES Action(sigle)
   );

   CREATE TABLE Player_franchise(
      id_player VARCHAR(50) ,
      date_arrivee DATE NOT NULL,
      date_depart DATE NOT NULL,
      id_franchise VARCHAR(50)  NOT NULL,
      PRIMARY KEY(id_player),
      FOREIGN KEY(id_player) REFERENCES Player(id_player),
      FOREIGN KEY(id_franchise) REFERENCES Franchise(id_franchise)
   );
