-- Categories
insert into tbl_category (id, name, parentid) values (1, 'Electronics', null);
insert into tbl_category (id, name, parentid) values (2, 'Clothing, Shoes & Accessories', null);
insert into tbl_category (id, name, parentid) values (3, 'Home & Outdoor', null);
insert into tbl_category (id, name, parentid) values (4, 'Beauty & Personal Care', null);
insert into tbl_category (id, name, parentid) values (5, 'Everything Else', null);
-- Subcategories for 'Electronics'
insert into tbl_category (id, name, parentid) values (6, 'Audio & Video Components', 1);
insert into tbl_category (id, name, parentid) values (7, 'Camera & Photo', 1);
insert into tbl_category (id, name, parentid) values (8, 'Computers', 1);
-- Subcategories for 'Clothing, Shoes & Accessories'
insert into tbl_category (id, name, parentid) values (9, 'Clothing', 1);
insert into tbl_category (id, name, parentid) values (10, 'Costumes & Accessories', 1);
insert into tbl_category (id, name, parentid) values (11, 'Fashion Accessories', 1);
-- Subcategories for 'Home & Outdoor'
insert into tbl_category (id, name, parentid) values (12, 'Furniture, Decor & Storage', 3);
insert into tbl_category (id, name, parentid) values (13, 'Antiques', 3);
insert into tbl_category (id, name, parentid) values (14, 'Appliances', 3);
-- Subcategories for 'Beauty & Personal Care'
insert into tbl_category (id, name, parentid) values (15, 'Accessories', 4);
insert into tbl_category (id, name, parentid) values (16, 'Bath & Shower', 4);
insert into tbl_category (id, name, parentid) values (17, 'Feminine Hygiene', 4);

-- Products for Category 'Electronics > Audio & Video Components'
insert into tbl_product (id, name, price, userid) values (1, 'TV 4K (32 GB)', 223.22, 1);
insert into tbl_product (id, name, price, userid) values (2, 'RCA ANT751 OUTDOOR ANTENNA OPTIMIZED FOR DIGITAL RECEPTION - UPTO 3.3 FT', 49.22, 1);
insert into tbl_product (id, name, price, userid) values (3, 'APC REPLACEMENT BATTERY NO 24', 299.00, 1);
insert into tbl_product_category (productid, categoryid) values (1, 6);
insert into tbl_product_category (productid, categoryid) values (2, 6);
insert into tbl_product_category (productid, categoryid) values (3, 6);
-- Products for Category 'Electronics > Camera & Photo'
insert into tbl_product (id, name, price, userid) values (4, 'CAXXX EOS REBEL T6 DSLR 18-55MM - 1159C003', 379.95, 1);
insert into tbl_product (id, name, price, userid) values (5, 'RCA ANT751 OUTDOOR ANTENNA OPTIMIZED FOR DIGITAL RECEPTION - UPTO 3.3 FT', 49.22, 1);
insert into tbl_product (id, name, price, userid) values (6, 'BEST CHOICE PRODUCTS 6-AXIS HEADLESS RC QUADCOPTER FPV RC DRONE W/ WIFI HD CAMERA, REAL TIME VIDEO, ALTITUDE HOLD', 42.99, 1);
insert into tbl_product_category (productid, categoryid) values (4, 7);
insert into tbl_product_category (productid, categoryid) values (5, 7);
insert into tbl_product_category (productid, categoryid) values (6, 7);
-- Products for Category 'Electronics > Computers'
insert into tbl_product (id, name, price, userid) values (7, 'APXXX MXCBXXK AIR MQD42LL/A 13.3" LCD NOTEBOOK - INTEL CORE I5 (5TH GEN) DUAL-CORE (2 CORE) 1.80 GHZ - 8 GB LPDDR3 - 256 GB SSD - MXC OS SIERRX - 1440 X 900 - INTXL HD GRAPHICS 6000 LPDDR3 - BLUETOOTH - ENGLISH (US) KEYBOARD - FRONT CAMERA/WEBCAM - IEEE 8', 1052.49, 1);
insert into tbl_product (id, name, price, userid) values (8, 'DXLL INSPIXXN 13 5000 SERIES 2-IN-1- I3-7100U- 1TB HDD- 4GB RAM', 479.99, 1);
insert into tbl_product (id, name, price, userid) values (9, 'HEWLXXX PAXXXRD 11-AE010NR X360 11 INTXL N3350 CHROMEBOOK CONVERTIBLE LAPTOP - 2MW49UA#ABA', 239.00, 1);
insert into tbl_product_category (productid, categoryid) values (7, 8);
insert into tbl_product_category (productid, categoryid) values (8, 8);
insert into tbl_product_category (productid, categoryid) values (9, 8);
-- Products for Category 'Clothing, Shoes & Accessories > Clothing'
insert into tbl_product (id, name, price, userid) values (10, 'DICKXXX WP595DS 30 32 MENS REGULAR STRAIGHT STRETCH TWILL CARGO PANT - DESERT SAND - 30 - 32', 26.99, 1);
insert into tbl_product (id, name, price, userid) values (11, 'TINKXXXXLL - TINXXXXOTS GIRLS YOUTH SLEEP PANTS', 11.00, 1);
insert into tbl_product (id, name, price, userid) values (12, 'INTENSXXX N4700112LRG ADULT NYLON DOUBLE KNIT PANT&#44; WHITE & ROYAL - LARGE', 12.28, 1);
insert into tbl_product_category (productid, categoryid) values (10, 9);
insert into tbl_product_category (productid, categoryid) values (11, 9);
insert into tbl_product_category (productid, categoryid) values (12, 9);
-- Products for Category 'Clothing, Shoes & Accessories > Costumes & Accessories'
insert into tbl_product (id, name, price, userid) values (13, 'DISGUIXX SHADOW NINJA GREEN MASTER NINJA DELUXE BOYS COSTUME, ONE COLOR, 7-8', 24.15, 1);
insert into tbl_product (id, name, price, userid) values (14, 'ZAXXXX STUDIOS M6003 SUPER DELUXE ORANGUTAN MASK', 48.94, 1);
insert into tbl_product (id, name, price, userid) values (15, 'RUBXXX INFLATABLE CHEWBACCA ADULT COSTUME-STANDARD', 82.94, 1);
insert into tbl_product_category (productid, categoryid) values (13, 10);
insert into tbl_product_category (productid, categoryid) values (14, 10);
insert into tbl_product_category (productid, categoryid) values (15, 10);
-- Products for Category 'Clothing, Shoes & Accessories > Fashion Accessories'
insert into tbl_product (id, name, price, userid) values (16, 'RXX-XXN MENS GRADIENT ACTIVE RB3386-004/13-67 SILVER AVIATOR SUNGLASSES', 103.99, 1);
insert into tbl_product (id, name, price, userid) values (17, 'TENXXXY BASIC KNIT WIRELESS HANDS-FREE BLUETOOTH BEANIE WITH BUILT-IN SPEAKERS - GREY', 24.95, 1);
insert into tbl_product (id, name, price, userid) values (18, 'AIRBORXX EXXROIDERED BUCKET HAT W44S44E', 20.49, 1);
insert into tbl_product_category (productid, categoryid) values (16, 11);
insert into tbl_product_category (productid, categoryid) values (17, 11);
insert into tbl_product_category (productid, categoryid) values (18, 11);
-- Products for Category 'Home & Outdoor > Furniture, Decor & Storage'
insert into tbl_product (id, name, price, userid) values (19, 'BESXXXFICE HIGH BACK MODERN MESH OFFICE CHAIR - BLACK', 47.99, 1);
insert into tbl_product (id, name, price, userid) values (20, 'FOLXXXLE OUTDOOR WOOD ADIRONDACK CHAIR W/ PULL OUT OTTOMAN', 56.99, 1);
insert into tbl_product (id, name, price, userid) values (21, '13-GALXXN TXXCH-FREE SENSOR AUTOMATIC STAINLESS STEEL TRASH CAN - STAINLESS STEEL', 52.99, 1);
insert into tbl_product_category (productid, categoryid) values (19, 11);
insert into tbl_product_category (productid, categoryid) values (20, 11);
insert into tbl_product_category (productid, categoryid) values (21, 11);
-- Products for Category 'Home & Outdoor > Antiques'
insert into tbl_product (id, name, price, userid) values (22, 'COLXXXN SAN FRXXXISCO GIANTS 24 CAN SOFT SIDED COOLER/LUNCHBOX MLB', 29.99, 1);
insert into tbl_product (id, name, price, userid) values (23, 'AMERIXXWARE PSGAUS45 45 MM AUSTIN SNOW GLOBE', 10.11, 1);
insert into tbl_product (id, name, price, userid) values (24, '24 IN. W X 24 IN. H ROXXD XXBLE VENT LOXXER&#44; FUNCTIONAL', 73.24, 1);
insert into tbl_product_category (productid, categoryid) values (22, 13);
insert into tbl_product_category (productid, categoryid) values (23, 13);
insert into tbl_product_category (productid, categoryid) values (24, 13);
-- Products for Category 'Home & Outdoor > Appliances'
insert into tbl_product (id, name, price, userid) values (25, 'E-Z DISHXXXHER BRACKET AND SCREWS GRANITE COUNTERTOP INSTALLATION KIT', 9.99, 1);
insert into tbl_product (id, name, price, userid) values (26, 'BONAXXXA BV1500TS 5-CUP CAXAFE COFFEE BREWER, STAINLESS STEEL', 67.92, 1);
insert into tbl_product (id, name, price, userid) values (27, 'DUXXXP LCD 1800-WATT PORXXXLE INDUCTION COOKTOP COUNTERTOP BURNER 9600LS', 100.99, 1);
insert into tbl_product_category (productid, categoryid) values (25, 14);
insert into tbl_product_category (productid, categoryid) values (26, 14);
insert into tbl_product_category (productid, categoryid) values (27, 14);
-- Products for Category 'Beauty & Personal Care > Accessories'
insert into tbl_product (id, name, price, userid) values (28, 'SPACE-SAVING SHOE ORGANIZER: SET OF 12', 24.99, 1);
insert into tbl_product (id, name, price, userid) values (29, 'COLDSTXXL COLD STEEL TI-LITE ZYTEL 6" POLISHED KNIFE 7.5IN. X 1.5IN. X 1.25IN.', 57.79, 1);
insert into tbl_product (id, name, price, userid) values (30, 'LXZ CLXIBORNE BORX BORX MEN COLOGNE SPRAY 3.4 OZ', 19.98, 1);
insert into tbl_product_category (productid, categoryid) values (28, 15);
insert into tbl_product_category (productid, categoryid) values (29, 15);
insert into tbl_product_category (productid, categoryid) values (30, 15);
-- Products for Category 'Beauty & Personal Care > Bath & Shower'
insert into tbl_product (id, name, price, userid) values (31, 'MOLTXN BROWN SOOTHING MILK & OATMEAL SOAP 75G/2.6OZ SET OF 6', 37.99, 1);
insert into tbl_product (id, name, price, userid) values (32, 'BATH BRUSH BACK SCRXB SCRUBBER MASSAGER SHOWER BODY BACK 13.5 HANDLE SPA PET NEW', 7.49, 1);
insert into tbl_product (id, name, price, userid) values (33, '9X SOAP DISPENSER DISH CASE HOLDER CONTAINER BOX BATHROOM CLEAN DRY TRAVEL CARRY', 13.99, 1);
insert into tbl_product_category (productid, categoryid) values (31, 16);
insert into tbl_product_category (productid, categoryid) values (32, 16);
insert into tbl_product_category (productid, categoryid) values (33, 16);
-- Products for Category 'Beauty & Personal Care > Feminine Hygiene'
insert into tbl_product (id, name, price, userid) values (34, 'GENUINE JXE GJO14457 CITRUS SCXNTED LIQUID HANDWASH&#44; ORANGE', 11.63, 1);
insert into tbl_product (id, name, price, userid) values (35, 'GENUINE JXE GJO14467 ALCOHOL-FREE FOAM HAND SANITIZER&#44; CLEAR', 12.14, 1);
insert into tbl_product (id, name, price, userid) values (36, 'MENDX 35601 LASTING-TOUCH - BROWN ROUND 8 OZ - IMPRINTED ALCOHOL', 10.37, 1);
insert into tbl_product_category (productid, categoryid) values (34, 17);
insert into tbl_product_category (productid, categoryid) values (35, 17);
insert into tbl_product_category (productid, categoryid) values (36, 17);

-- Adding some Products to other categories
insert into tbl_product_category (productid, categoryid) values (1, 8);
insert into tbl_product_category (productid, categoryid) values (11, 10);
insert into tbl_product_category (productid, categoryid) values (23, 11);
insert into tbl_product_category (productid, categoryid) values (32, 17);
insert into tbl_product_category (productid, categoryid) values (34, 16);
insert into tbl_product_category (productid, categoryid) values (35, 16);
insert into tbl_product_category (productid, categoryid) values (36, 16);