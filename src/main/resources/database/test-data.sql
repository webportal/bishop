INSERT INTO categories (id, name, urlToIcon)VALUES(1, 'Children', '/resources/images/girl.png');
INSERT INTO categories (id, name, urlToIcon)VALUES(2, 'Real estate', '/resources/images/home.png');
INSERT INTO categories (id, name, urlToIcon)VALUES(3, 'Transport', '/resources/images/hyundai_coupe.png');
INSERT INTO categories (id, name, urlToIcon)VALUES(4, 'Job', '/resources/images/my_briefcase.png');
INSERT INTO categories (id, name, urlToIcon)VALUES(5, 'Animals', '/resources/images/dog.png');
INSERT INTO categories (id, name, urlToIcon)VALUES(6, 'House and Garden', '/resources/images/gohome.png');
INSERT INTO categories (id, name, urlToIcon)VALUES(7, 'Electronics', '/resources/images/television.png');
INSERT INTO categories (id, name, urlToIcon)VALUES(8, 'Services', '/resources/images/network_connection_manager.png');
INSERT INTO categories (id, name, urlToIcon)VALUES(9, 'Fashion', '/resources/images/gucci_woman_shoe.png');
INSERT INTO categories (id, name, urlToIcon)VALUES(10, 'Sport', '/resources/images/tennis.png');
INSERT INTO categories (id, name, urlToIcon)VALUES(11, 'Business', '/resources/images/office_building.png');
INSERT INTO categories (id, name, urlToIcon)VALUES(12, 'Acquaintance', '/resources/images/heart.png');
INSERT INTO categories (id, name, urlToIcon)VALUES(13, 'Free', '/resources/images/home.png');
INSERT INTO categories (id, name, urlToIcon)VALUES(14, 'Exchange', '/resources/images/toy.png');

INSERT INTO categories (id, name, urlToIcon, parentCategory_id) VALUES(15, 'Busses', '/resources/images/hp_auto.png', 1);
INSERT INTO categories (id, name, urlToIcon, parentCategory_id) VALUES(16, 'Auto', '/resources/images/saleen.png', 1);
INSERT INTO categories (id, name, urlToIcon, parentCategory_id) VALUES(17, 'Exchange', '/resources/images/chrysler.png', 1);

  INSERT INTO categories_categories (categories_id, subCategories_id) VALUES(1, 15);
  INSERT INTO categories_categories (categories_id, subCategories_id) VALUES(1, 16);
  INSERT INTO categories_categories (categories_id, subCategories_id) VALUES(1, 17);