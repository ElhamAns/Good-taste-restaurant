Use Restaurant;

insert into Customer (CName, Gender, BDate, Contact_NO, Email, Address, CUsername, CPassword)
values
('Sara Ahmed', 'F', '1999-05-14', '0544253678', 'Sarah13@outlook.com', 'Almanar,12 St,11', 'sara_13', 'Ss@12345'),
('Naif Mohammed', 'M', '2001-10-21', '0563734643', 'Naifmoh@gmail.com', 'Alkhuzama,11B St,7070', 'naifm78', 'Nn-562637'),
('Suhail Jaber', 'M', '1995-01-11', '0576834902','Suhail_14@gmail.com', 'Alrakah Aljanubiyah,Amr Alhaj St,8827', 'suhailmm2', 'OoSs_1222'),
('Raghad Hamed', 'F', '1985-02-03', '0543786401','RaghHamed@hotmail.com', 'Alshifa, Yanbu St,7179', 'raghadhamad12', 'Rraghd55@1123'),
('Yusra Tariq', 'F', '1991-12-29', '0589530263', 'Yusrab17@gmail.com', 'Ar rayan, Urjuan St, 4890', 'Yus_50', 'Yyuastar__1478'),
('Amal Sameer', 'F', '1993-11-29', '0579302532', 'AmalSs11@hotmail.com', 'Al Nada, 27B St, 3928', 'AmalS', 'Aamaall_@11'),
('Areej Jaber', 'F', '2002-02-27', '0503725845', 'Areej_15@outlook.com', 'Taybah, Mohammed Bin Amr St, 3590', 'Areej_j', 'Aaarej@@889'),
('Laith Faris', 'M', '2000-04-29', '0536743902', 'LaithFaris1@gmail.com', 'Uhud, 56 St, 4259', 'Laith12', 'Laithh__121212'),
('Mazin Khalid', 'M', '1999-05-29', '0507141214', 'MazinKhalid@hotmail.com', 'Badr, Imam Muslim St, 7586', 'Mazin10', 'Mmazzinn@1010'),
('Ali Abdullah', 'M', '1990-06-06', '0589462911', 'aliabdullah@outlook.com', 'Ash shulah, Al Salah St, 3320', 'Ali_A', 'Aliabdullah_1@1');
 
 
insert into Employee (SSN, EName, Gender, BDate, Contact_NO, Email, Job_Title, Salary, EUsername, EPassword)
values
('149459634', 'Ahmed Yasser', 'M', '1981-11-03', '0583528937', 'AhmedYasser@Goodtaste.com', 'Manager', 9500, 'Ahmed_Yasser', 'Ahm@37288'),
('156834847', 'Fatima Bassem', 'F', '1988-02-12', '0579342738', 'FatimaBssm@Goodtaste.com', 'Chef', 9000, 'Fatimah_bassem', 'Fatim0579@34'),
('179-373873', 'Lena Abdullah', 'F', '1992-10-11', '0521548920', 'LenaAbdullah1@Goodtaste.com', 'Waiter', 5000, 'Lena_Abdullah', 'Lena__188288'),
('132392003', 'Bader Talal', 'M', '1999-01-19', '0588452176', 'BaderTal@Goodtaste.com', 'Barista', 5000, 'Bader_Talal', 'Bbdr_tallal'),
('103363628', 'Abdulrahman Ali', 'M', '1999-02-19', '0593265013', 'AbdulrahmanAli@Goodtaste.com', 'Cashier', 5000, 'Abdulrahman_Ali', 'Abdulrahmanaliii999'),
('102875092', 'Hattan Faisal', 'F', '1999-01-19', '0598326572', 'HattanFaisal@Goodtaste.com', 'Cashier', 5000, 'Hattan_Faisal', 'Hattanffaisal'),
('102785429', 'Faisal Salman', 'M', '1997-11-20', '0521124958', 'FaisalSalman@Goodtaste.com', 'Waiter', 5000, 'Faisal_Salman', 'Faisal_Salman12'),
('109281726', 'Fahad Zaid', 'M', '2000-09-21', '0586934092', 'FahadZaid@Goodtaste.com', 'Barista', 5000, 'Fahad_Zaid', 'Fahad@Zaid'),
('105762129', 'Deem Saud', 'F', '1990-05-21', '0597621283', 'DeemSaud@Goodtaste.com', 'Chef', 9000, 'Deem_Saud', 'Deem_Saud99'),
('102738239', 'Tala Abdulaziz', 'F', '1993-03-15', '0548246271', 'TalaAbdulaziz@Goodtaste.com', 'Waiter', 5000, 'Tala_Abdulaziz', 'Tala@Abdulaziz');



insert into Menu (Item, Item_type, Calories, Price)
values
('Margherita pizza', 'Dishes', 882, 42),
('Truffle Mushroom pizza', 'Dishes', 1208, 53),
('Paprika Chicken pizza', 'Dishes', 1260, 50),
('Spaghetti Chicken', 'Dishes', 1365, 57),
('Pretty in pink penne', 'Dishes', 546, 47),
('Shrimp pesto linguine', 'Dishes', 1207, 71),
('Salmon au four', 'Dishes', 1354, 97),
('Tenderloin beef steak', 'Dishes', 1302, 98),
('Grilled chicken', 'Dishes', 1039, 77),
('Chicken ratatouille', 'Dishes', 1848, 82),
('Risotto chicken', 'Dishes', 819, 63),
('Classic burger', 'Dishes', 1291, 47),
('Cookies', 'Dessert', 150, 10),
('Strawberry donuts', 'Dessert', 280, 10),
('Chocolate cupcake', 'Dessert', 240, 10),
('Cheesecake', 'Dessert', 320, 18),
('Chocolate cake', 'Dessert', 400, 18),
('Brownies', 'Dessert', 410, 10),
('Mini pancakes', 'Dessert', 260, 15),
('Waffles', 'Dessert', 280, 15),
('French toast', 'Dessert', 300, 18),
('Red velvet cupcake', 'Dessert', 250, 10),
('Orange Juice', 'Drinks', 1029, 22),
('Apple Juice', 'Drinks', 116, 22),
('Carrot Juice', 'Drinks', 430, 22),
('Strawberry Juice', 'Drinks', 42, 22),
('Pepsi', 'Drinks', 141, 5),
('Coca Cola', 'Drinks', 184, 5),
('7UP', 'Drinks', 200, 5),
('Americano', 'Drinks', 32, 18),
('Hot Chocolate', 'Drinks', 84, 21),
('Cappuccino', 'Drinks', 137, 19),
('Caffee Latte', 'Drinks', 105, 19),
('Eapresso', 'Drinks', 16, 12);


insert into Orders (Customer_NO, Payment, Orders_method, Total)
values
(103, 'Cash', 'Delivery', 75),
(101, 'Card', 'Delivery', 19),
(104, 'Card', 'Pick up', 34),
(100, 'Cash', 'Pick up', 139),
(102, 'Card', 'Delivery', 18),
(105, 'Card', 'Delivery', 172),
(106, 'Cash', 'Pick up', 121),
(108, 'Cash', 'Pick up', 46),
(107, 'Card', 'Delivery', 21),
(109, 'Card', 'Pick up', 37);


insert into Cart (Item_quantity, Customer_NO, Item_ID)
values
(1, 103, 2),
(1, 103, 23),
(1, 101, 32),
(1, 104, 19),
(1, 104, 32),
(1, 100, 1),
(1, 100, 2),
(2, 100, 23),
(1, 102, 16),
(1, 105, 5),
(1, 105, 11),
(1, 105, 1),
(4, 105, 28),
(1, 106, 9),
(1, 106, 26),
(1, 106, 24),
(1, 108, 15),
(2, 108, 30),
(1, 107, 31),
(1, 109, 21),
(1, 109, 33);


insert into Bill (DPurchase, Customer_NO, Orders_ID)
values
('2023-01-01 19:33:12', 103, 1000),
('2023-01-03 16:23:14', 101, 1001),
('2023-01-09 20:30:34', 104, 1002),
('2023-01-12 18:45:55', 100, 1003),
('2023-01-20 14:22:46', 102, 1004),
('2023-01-22 22:46:03', 105, 1005),
('2023-01-28 21:37:15', 106, 1006),
('2023-02-05 17:12:01', 108, 1007),
('2023-02-06 15:59:30', 107, 1008),
('2023-02-06 19:02:53', 109, 1009);


insert into Feedback (Customer_NO, Service, Suggestion, Cleanness, FoodQuality)
values
(103, 5, 'No Suggestions', 5, 5),
(101, 4, 'No Food Offers', 5, 3),
(104, 3, 'Train employees for an excellent customer service', 4, 4),
(100, 4, 'No Suggestions', 5, 4),
(102, 5, 'No Suggestions', 5, 5),
(105, 4, 'The food so good', 5, 5),
(106, 2, 'They did not take my order fast', 3, 3),
(108, 5, 'Loved the employees energy', 5, 5),
(107, 4, 'No Suggestions', 4, 3),
(109, 4, 'Good experience', 4, 4);
