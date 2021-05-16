INSERT INTO `race` (`NAME`,`DESCRIPTION`) 
VALUES ('Human','Humans'),
('Elf','Elves'),
('Dwarf','Dwarves'),
('Giant','Giants'),
('Goblin','Goblins'),
('Ogre','Ogres'),
('Troll','Trolls'),
('Arachnid','Arachnids'),
('Automaton','Automatons'),
('Dragonian','Dragonians'),
('Avian','Avians'),
('Elemental','Elementals'),
('Demigod','Demigods'),
('Demon','Demons'),
('Angel','Angels');

INSERT INTO `element` (`ID`,`BAD_AGAINST`,`COLOR`,`DESCRIPTION`,`GOOD_AGAINST`,`NAME`) 
VALUES (1,'7,9,4,2','Red','FIRE','5,8,3,6','Fire'),
(2,'5,8,3,6','Blue','WATER','1,7,9,4','Water'),
(3,'4,1,7,9','Purple','WIND','6,2,5,8','Wind'),
(4,'2,5,8,9','Orange','EARTH','6,1,7,3','Earth'),
(5,'8,3,6,1','Green','NATURE','7,9,4,2','Nature'),
(6,'1,7,3,4','Yellow','ELECTRIC','2,5,8,9','Electric'),
(7,'9,4,2,5','White','LIGHT','8,3,6,1','Light'),
(8,'3,6,1,7','Black','DARK','9,4,2,5','Dark'),
(9,'6,2,5,8','Grey','METAL','3,4,1,7','Metal');

INSERT INTO `symbol` (`NAME`,`DESCRIPTION`) 
VALUES ('Lion','Lion'),
 ('Tiger', 'Tiger'),
 ('Leopard', 'Leopard'),
 ('Sphinx', 'Sphinx'),
 ('Black Panther', 'Black Panther'),
 ('Elephant','Elephant'),
 ('Rhino','Rhino'),
 ('Stag','Stag'),
 ('Wolf','Wolf'),
 ('Nine Tailed Fox','Nine Tailed Fox'),
 ('Rat','Rat'),
 ('Boar','Boar'),
 ('Taurus','Taurus'),
 ('Cat','Cat'),
 ('Dog','Dog'),
 ('Horse','Horse'),
 ('Ram','Ram'),
 ('Bat','Bat'),
 ('Centaur','Centaur'),
 ('Cerebus','Cerebus'),
 ('Western Dragon','Western Dragon'),
 ('Eastern Dragon','Eastern Dragon'),
 ('Salamander','Salamander'),
 ('Tortoise','Tortoise'),
 ('Cobra','Cobra'),
 ('Basilisk','Basilisk'),
 ('Manticore','Manticore'),
 ('Hydra','Hydra'),
 ('Chimera','Chimera'),
 ('Gargoyle','Gargoyle'),
 ('Leviathan','Leviathan'),
 ('Behemoth Hippo','Behemoth Hippo'),
 ('Kraken','Kraken'),
 ('Pisces Pair','Pisces Pair'),
 ('Moby Dick Sperm Whale','Moby Dick Sperm Whale'),
 ('Blue Whale','Blue Whale'),
 ('Great White Shark','Great White Shark'),
 ('Blue Marlin','Blue Marlin'),
 ('Scorpion','Scorpion'),
 ('Spider','Spider'),
 ('Crab','Crab'),
 ('Mantis','Mantis'),
 ('Butterfly','Butterfly'),
 ('Stag Bettle','Stag Bettle'),
 ('Rhino Bettle','Rhino Bettle'),
 ('Monkey','Monkey'),
 ('Phoenix','Phoenix'),
 ('Peacock','Peacock'),
 ('Eagle','Eagle'),
 ('Vulture Rocs','Vulture Rocs'),
 ('Griffon','Griffon'),
 ('Panda Bear','Panda Bear'),
 ('Godzilla','Godzilla'),
 ('Snail','Snail'),
 ('Frog','Frog'),
 ('Cheetah','Cheetah'),
 ('Wasp','Wasp'),
 ('Bee','Bee'),
 ('Worm','Worm'),
 ('Centipede','Centipede'),
 ('Leech','Leech'),
 ('Camel','Camel'),
 ('Giraffe','Giraffe'),
 ('Ant','Ant'),
 ('Rabbit','Rabbit'),
 ('Badger','Badger'),
 ('Mosquito','Mosquito'),
 ('Black Bear','Black Bear'),
 ('White Bear','White Bear'),
 ('Charybaldis','Charybaldis'),
 ('Chameleon','Chameleon'),
 ('Squirrel','Squirrel'),
 ('Turtle','Turtle'),
 ('Pegasus','Pegasus'),
 ('Unicorn','Unicorn'),
 ('Pterodactyl','Pterodactyl'),
 ('Icthyosaur Loch Ness','Icthyosaur Loch Ness'),
 ('Spinosaur','Spinosaur'),
 ('T-Rex','T-Rex'),
 ('Triceratops','Triceratops'),
 ('Stegosaurus','Stegosaurus'),
 ('Brachisaurus','Brachisaurus'),
 ('Dimetrodon','Dimetrodon'),
 ('Men of War Jellyfish','Men of War Jellyfish'),
 ('Swan','Swan'),
 ('Crane','Crane'),
 ('Albatross','Albatross'),
 ('Owl','Owl'),
 ('Dove','Dove'),
 ('Crocodile','Crocodile'),
 ('Assyrian Sphinx Bull','Assyrian Sphinx Bull'),
 ('Hundred Hands Gaia','Hundred Hands Gaia'),
 ('Gorilla','Gorilla'),
 ('Lemur','Lemur'),
 ('Armadillo','Armadillo'),
 ('Hippogriff','Hippogriff'),
 ('Raptor','Raptor'),
 ('Wyvern','Wyvern'),
 ('Harpy','Harpy'),
 ('Weasel','Weasel'),
 ('Penguin','Penguin'),
 ('Walrus','Walrus'),
 ('Dolphin','Dolphin'),
 ('Yak','Yak'),
 ('Parrot','Parrot'),
 ('Starfish','Starfish'),
 ('Manta Ray','Manta Ray'),
 ('Raven','Raven'),
 ('Rooster','Rooster'),
 ('Hyena','Hyena'),
 ('Racoon','Racoon'),
 ('Slug Pyramid','Slug Pyramid'),
 ('Mermaid','Mermaid'),
 ('Dragon Fly','Dragon Fly'),
 ('Tick', 'Tick'),
 ('Lobster','Lobster'),
 ('Hammerhead Shark','Hammerhead Shark'),
 ('Sawhead Shark','Sawhead Shark'),
 ('Sword Fish','Sword Fish'),
 ('Electric Eel','Electric Eel'),
 ('Swellow','Swellow'),
 ('Pelican','Pelican'),
 ('Kangaroo','Kangaroo'),
 ('Sloth','Sloth'),
 ('Jackal','Jackal'),
 ('Lion Fish','Lion Fish'),
 ('Porcupine','Porcupine'),
 ('Beaver','Beaver'),
 ('Mole','Mole'),
 ('Ankylosaur','Ankylosaur'),
 ('Donkey','Donkey'),
 ('Bighorn Sheep','Bighorn Sheep'),
 ('Spear End Fish','Spear End Fish'),
 ('Axe Head Fish','Axe Head Fish'),
 ('Termite','Termite'),
 ('Frilled Mane Dragon','Frilled Mane Dragon'),
 ('Plankton Swarm','Plankton Swarm'),
 ('Angler Fish','Angler Fish'),
 ('Sea Horse Dragon','Sea Horse Dragon'),
 ('Sponge Tree','Sponge Tree'),
 ('Trireme Barcuda','Trireme Barcuda'),
 ('Tower Tree Fig','Tower Tree Fig'),
 ('Cactus Black Tower','Cactus Black Tower'),
 ('Life Banyan','Life Banyan'),
 ('Red Rose Tree','Red Rose Tree'),
 ('Gold Wheat Tree','Gold Wheat Tree'),
 ('Yellow Sunflower Field','Yellow Sunflower Field'),
 ('Bamboo City','Bamboo City'),
 ('Green Watermelon','Green Watermelon'),
 ('Brown Coconut Ship','Brown Coconut Ship'),
 ('Moss Amoeba Green','Moss Amoeba Green'),
 ('Blue Mushroom Head','Blue Mushroom Head'),
 ('Purple Venus Flytrap','Purple Venus Flytrap'),
 ('Black Ooze Pitcher Plant','Black Ooze Pitcher Plant'),
 ('Orange Pumpling Wine Dome','Orange Pumpling Wine Dome'),
 ('Chery Blossom Pink & White','Chery Blossom Pink & White'),
 ('Aqua Lotus Blue','Aqua Lotus Blue'),
 ('Spiral Grape Vine Tree','Spiral Grape Vine Tree');
	
    
INSERT INTO `skill` (`NAME`, `DESCRIPTION`) 
VALUES ('Super Strength','Super Strength')
 , ( 'Super Speed','Super Speed')
 , ( 'Anti gravity Flight','Anti gravity Flight')
 , ( 'Energy Boost Flight','Energy Boost Flight')
 , ( 'Heat Vision','Heat Vision')
 , ( 'X-Ray Vision','X-Ray Vision')
 , ( 'Thermal Vision','Thermal Vision')
 , ( 'Sonar Vision','Sonar Vision')
 , ( 'Medium-proof Vision','Medium-proof Vision')
 , ( 'Water Sucker','Water Sucker')
 , ( 'Extra-Human Senses','Extra-Human Senses')
 , ( 'Pre-cognition Future Sensing','Pre-cognition Future Sensing')
 , ( 'Ol-factory Senses','Ol-factory Senses')
 , ( 'Invulnerability','Invulnerability')
 , ( 'Super-Breath','Super-Breath')
 , ( 'Non-Organic Body','Non-Organic Body')
 , ( 'Force Push','Force Push')
 , ( 'Duplication','Duplication')
 , ( 'Energy Parasite','Energy Parasite')
 , ( 'Energy Source','Energy Source')
 , ( 'Matter Phasing','Matter Phasing')
 , ( 'Expanding Size','Expanding Size')
 , ( 'Telescopic Vision','Telescopic Vision')
 , ( 'Microscopic Vision','Microscopic Vision')
 , ( 'Time Freeze','Time Freeze')
 , ( 'Self Explosion','Self Explosion')
 , ( 'Energy Disc','Energy Disc')
 , ( 'Light Ray Blast','Light Ray Blast')
 , ( 'Weight Changer','Weight Changer')
 , ( 'Force Pull','Force Pull')
 , ( 'Object Shapeshifter','Object Shapeshifter')
 , ( 'Sonic Shock Wave','Sonic Shock Wave')
 , ( 'High Jump','High Jump')
 , ( 'Teleportation','Teleportation')
 , ( 'Elasticity','Elasticity')
 , ( 'Super Brain','Super Brain')
 , ( 'Body Controller','Body Controller')
 , ( 'Astro projection','Astro projection')
 , ( 'Telekenesis','Telekenesis')
 , ( 'Healer','Healer')
 , ( 'Force Field','Force Field')
 , ( 'Shadow Control','Shadow Control')
 , ( 'Invisibility','Invisibility')
 , ( 'Illusion Hologram Creation','Illusion Hologram Creation')
 , ( 'Dark Energy','Dark Energy')
 , ( 'Fear Induction','Fear Induction')
 , ( 'Hypnotism','Hypnotism')
 , ( 'Technopath','Technopath')
 , ( 'Energy Bubble','Energy Bubble')
 , ( 'Mental Shutdown','Mental Shutdown')
 , ( 'Sleep Inducing','Sleep Inducing')
 , ( 'Mental Chaos Induction','Mental Chaos Induction')
 , ( 'Energy Sensor','Energy Sensor')
 , ( 'Accelerating Ageing','Accelerating Ageing')
 , ( 'Deaccelearating Ageing','Deaccelearating Ageing')
 , ( 'Amnesia Induction','Amnesia Induction')
 , ( 'Thought Pusher','Thought Pusher')
 , ( 'Mind Reading','Mind Reading')
 , ( 'Mind Control','Mind Control')
 , ( 'Telepathy','Telepathy')
 , ( 'Machine Shapeshifter','Machine Shapeshifter')
 , ( 'Sand Body','Sand Body')
 , ( 'Clay Body','Clay Body')
 , ( 'Rock Body','Rock Body')
 , ( 'Steel Body','Steel Body')
 , ( 'Diamond Body','Diamond Body')
 , ( 'Petroleum Body','Petroleum Body')
 , ( 'Paper Body','Paper Body')
 , ( 'Ink Body','Ink Body')
 , ( 'Concrete Body','Concrete Body')
 , ( 'Slime Body','Slime Body')
 , ( 'Mercurey Body','Mercurey Body')
 , ( 'Glue Body','Glue Body')
 , ( 'Gas Body','Gas Body')
 , ( 'Ice Body','Ice Body')
 , ( 'Water Body','Water Body')
 , ( 'Magma Body','Magma Body')
 , ( 'Glass Body','Glass Body')
 , ( 'Smoke Body','Smoke Body')
 , ( 'Resouce Metamorphosis','Resouce Metamorphosis')
 , ( 'Super Jaw','Super Jaw')
 , ( 'Aquatic Adaptation','Aquatic Adaptation')
 , ( 'Web Producing','Web Producing')
 , ( 'Suction Adaptation Upside Locomotion','Suction Adaptation Upside Locomotion')
 , ( 'Animal Senses','Animal Senses')
 , ( 'Animal Shapeshifting','Animal Shapeshifting')
 , ( 'Free Shapeshifter','Free Shapeshifter')
 , ( 'Size Increase','Size Increase')
 , ( 'Size Decrease','Size Decrease')
 , ( 'Plant Controller','Plant Controller')
 , ( 'Vegetation Body','Vegetation Body')
 , ( 'Man Swarm','Man Swarm')
 , ( 'Animal Man','Animal Man')
 , ( 'Man Animal','Man Animal')
 , ( 'Regeneration','Regeneration')
 , ( 'Hammerhead','Hammerhead')
 , ( 'Toad Tongue','Toad Tongue')
 , ( 'Organic Horms','Organic Horms')
 , ( 'Organic Tentacles','Organic Tentacles')
 , ( 'High Powered Muscles','High Powered Muscles')
 , ( 'Hand Rope','Hand Rope')
 , ( 'Organic Tail','Organic Tail')
 , ( 'Organic Body Armour','Organic Body Armour')
 , ( 'Organic Spikes Production','Organic Spikes Production')
 , ( 'Organic Wings','Organic Wings')
 , ( 'Organic Pincer Arms','Organic Pincer Arms')
 , ( 'Organic Stinger Tail','Organic Stinger Tail')
 , ( 'Venom Production','Venom Production')
 , ( 'Acid Production','Acid Production')
 , ( 'Biochemical & Pheromones Producing','Biochemical & Pheromones Producing')
 , ( 'Chemical Gas Producing','Chemical Gas Producing')
 , ( 'Super Human Agility & Reflexes','Super Human Agility & Reflexes')
 , ( 'Super Momentum','Super Momentum')
 , ( 'Animal Communication','Animal Communication')
 , ( 'Physical Aura Form','Physical Aura Form')
 , ( 'Plant pseudopodia','Plant pseudopodia')
 , ( 'Super Virus Host','Super Virus Host')
 , ( 'Chimera','Chimera')
 , ( 'Metallic Claws','Metallic Claws')
 , ( 'Metallic Ball Form','Metallic Ball Form')
 , ( 'Cyborg','Cyborg')
 , ( 'Metallic Tentacles','Metallic Tentacles')
 , ( 'biological Manipulation','biological Manipulation')
 , ( 'Super Healing Factor','Super Healing Factor')
 , ( 'Creature Spawning','Creature Spawning')
 , ( 'Solid Light Shaping','Solid Light Shaping')
 , ( 'Light based Energy Projection','Light based Energy Projection')
 , ( 'Light Transformation','Light Transformation')
 , ( 'Solar Battery','Solar Battery')
 , ( 'Magnetic Field Manipulation','Magnetic Field Manipulation')
 , ( 'Nuclear Forces Manipulation','Nuclear Forces Manipulation')
 , ( 'Gravity Field Manipulation','Gravity Field Manipulation')
 , ( 'Meteor Manipulation','Meteor Manipulation')
 , ( 'Pyrokenesis','Pyrokenesis')
 , ( 'Hydrokenesis','Hydrokenesis')
 , ( 'Electrokenesis','Electrokenesis')
 , ( 'Aerokenesis','Aerokenesis')
 , ( 'Geokenesis','Geokenesis')
 , ( 'Cryokenesis','Cryokenesis')
 , ( 'Vibratokenesis','Vibratokenesis')
 , ( 'Weather Manipulation','Weather Manipulation')
 , ( 'Static Charge Manipulation','Static Charge Manipulation')
 , ( 'Luminokenesis','Luminokenesis')
 , ( 'Mutation Controller','Mutation Controller')
 , ( 'Audiokenesis','Audiokenesis')
 , ( 'Substance Exhaling fire Breathing','Substance Exhaling fire Breathing')
 , ( 'Spontaneous Combustion Induction','Spontaneous Combustion Induction')
 , ( 'Momentum Manipulation','Momentum Manipulation')
 , ( 'Space Manipulation','Space Manipulation')
 , ( 'Time Manipulation','Time Manipulation' );
  
-- INSERT INTO `heroacademy`.`user` (`ID`, `USER_NAME`,  `PASSWORD`, `FIRST_NAME`, `LAST_NAME`, `PRIMARY_EMAIL`, `SECONDARY_EMAIL`, `GENDER`, `DOB`, `HEIGHT`, `WEIGHT`, `STRENGTH`, `SPEED`,  `INTELLIGENCE`,  `WILLPOWER`, `STAMINA`, `COORDINATION`, `FORTITIUDE`, `DURABILLITY`)
-- VALUES 
-- ('10000', 'smathur',  'root', 'SHREY', 'MATHUR', 'shreymathur93@gmail.com', 'shreymathur93@gmail.com', 'M', '1993-02-25', '1', '1',  '1', '1', '1', '1', '1', '1', '1', '1'),
-- ('10001', 'smathur1',  'root', 'SHREK', 'MARTELL', 'shreymathur93@gmail.com', 'shreymathur93@gmail.com', 'M', '1994-09-25', '1', '1',  '1', '1', '1', '1', '1', '1', '1', '1'),
-- ('10002', 'smathur2',  'root', 'SHREDDER', 'MAKO', 'shreymathur93@gmail.com', 'shreymathur93@gmail.com', 'M', '1996-12-25', '1', '1',  '1', '1', '1', '1', '1', '1', '1', '1'),
-- ('10003', 'smathur3',  'root', 'SHEIK', 'MAQBOOL', 'shreymathur93@gmail.com', 'shreymathur93@gmail.com', 'M', '1990-07-25', '1', '1',  '1', '1', '1', '1', '1', '1', '1', '1'),
-- ('10004', 'smathur3',  'root', 'SHREE', 'MATHURPAN', 'shreymathur93@gmail.com', 'shreymathur93@gmail.com', 'F', '1994-11-29', '1', '1',  '1', '1', '1', '1', '1', '1', '1', '1');

-- INSERT INTO `heroacademy`.`element_mapping` (`element_ID`, `ID`) VALUES 
-- ('1', '10000'),
-- ('2', '10001'),
-- ('3', '10002'),
-- ('4', '10003'),
-- ('5', '10004');

-- INSERT INTO `heroacademy`.`race_mapping` (`race_ID`, `ID`) VALUES 
-- ('1', '10000'),
-- ('2', '10001'),
-- ('3', '10002'),
-- ('4', '10003'),
-- ('5', '10004');

-- INSERT INTO `heroacademy`.`symbol_mapping` (`symbol_ID`, `ID`) VALUES 
-- ('1', '10000'),
-- ('21', '10001'),
-- ('31', '10002'),
-- ('41', '10003'),
-- ('51', '10004');

-- INSERT INTO `heroacademy`.`skill_mapping` (`user_ID`, `skill_ID`, `skill_level`) VALUES 
-- ('10000', '1', '10'),
-- ('10000', '4', '10'),
-- ('10001', '67', '10'),
-- ('10001', '12', '10'),
-- ('10002', '21', '10'),
-- ('10002', '90', '10'),
-- ('10003', '65', '10'),
-- ('10003', '92', '10'),
-- ('10004', '71', '10'),
-- ('10004', '34', '10');
  