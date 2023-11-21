CREATE DATABASE basket;
\C basket;

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
      season_end DATE NOT NULL,
      PRIMARY KEY(id)
   );

   -- CREATE TABLE Role(
   --   id VARCHAR(50) ,
      --role_name VARCHAR(50)  NOT NULL,
      --id_player VARCHAR(50)  NOT NULL,
      --PRIMARY KEY(id),
      --FOREIGN KEY(id_player) REFERENCES Player(id)
   --);

   CREATE TABLE Action(
      id VARCHAR(50) ,
      action_name VARCHAR(50) ,
      PRIMARY KEY(id)
   );

   CREATE TABLE Game(
      id VARCHAR(50),
      -- game_start TIMESTAMP NOT NULL,
      -- game_end TIMESTAMP NOT NULL,
      id_franchise1 VARCHAR(50) REFERENCES Franchise(id),
      id_franchise2 VARCHAR(50) REFERENCES Franchise(id),
      id_season VARCHAR(50)  NOT NULL,
      PRIMARY KEY(id),
      FOREIGN KEY(id_season) REFERENCES Season(id)
   );

   CREATE TABLE Statistics(
      id VARCHAR(50) ,
      id_player VARCHAR(50)  NOT NULL,
      id_game VARCHAR(50)  NOT NULL,
      id_action VARCHAR(50)  NOT NULL,
      PRIMARY KEY(id),
      FOREIGN KEY(id_player) REFERENCES Player(id),
      FOREIGN KEY(id_game) REFERENCES Game(id),
      FOREIGN KEY(id_action) REFERENCES Action(id)
   );

   CREATE TABLE Player_franchise(
      id varchar(50) primary key ,
      id_player VARCHAR(50) ,
      date_arrivee DATE NOT NULL,       -- Date d'arrivee dans la franchise
      id_franchise VARCHAR(50)  NOT NULL,
      FOREIGN KEY(id_player) REFERENCES Player(id),
      FOREIGN KEY(id_franchise) REFERENCES Franchise(id)
   );
