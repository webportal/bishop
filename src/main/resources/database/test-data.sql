INSERT INTO categories (id, name, urlToIcon, root_category, has_children)VALUES(2, 'Children', '/resources/images/girl.png', 1,1);
INSERT INTO categories (id, name, urlToIcon, root_category, has_children)VALUES(3, 'Real estate', '/resources/images/home.png', 1,0);
INSERT INTO categories (id, name, urlToIcon, root_category, has_children)VALUES(4, 'Transport', '/resources/images/hyundai_coupe.png',1,0);
INSERT INTO categories (id, name, urlToIcon, root_category, has_children)VALUES(5, 'Job', '/resources/images/my_briefcase.png',1,0);
INSERT INTO categories (id, name, urlToIcon, root_category, has_children)VALUES(6, 'Animals', '/resources/images/dog.png',1,0);
INSERT INTO categories (id, name, urlToIcon, root_category, has_children)VALUES(7, 'House and Garden', '/resources/images/gohome.png',1,0);
INSERT INTO categories (id, name, urlToIcon, root_category, has_children)VALUES(8, 'Electronics', '/resources/images/television.png',1,0);
INSERT INTO categories (id, name, urlToIcon, root_category, has_children)VALUES(9, 'Services', '/resources/images/network_connection_manager.png',1,0);
INSERT INTO categories (id, name, urlToIcon, root_category, has_children)VALUES(10, 'Fashion', '/resources/images/gucci_woman_shoe.png',1,0);
INSERT INTO categories (id, name, urlToIcon, root_category, has_children)VALUES(11, 'Sport', '/resources/images/tennis.png',1,0);
INSERT INTO categories (id, name, urlToIcon, root_category, has_children)VALUES(12, 'Business', '/resources/images/office_building.png',1,0);
INSERT INTO categories (id, name, urlToIcon, root_category, has_children)VALUES(13, 'Acquaintance', '/resources/images/heart.png',1,0);
INSERT INTO categories (id, name, urlToIcon, root_category, has_children)VALUES(14, 'Free', '/resources/images/home.png',1,0);
INSERT INTO categories (id, name, urlToIcon, root_category, has_children)VALUES(15, 'Exchange', '/resources/images/toy.png',1,0);

INSERT INTO categories (id, name, urlToIcon, parentCategory_id, root_category, has_children) VALUES(16, 'Busses', '/resources/images/hp_auto.png', 2,0,0);
INSERT INTO categories (id, name, urlToIcon, parentCategory_id, root_category, has_children) VALUES(17, 'Auto', '/resources/images/saleen.png', 2,0,0);
INSERT INTO categories (id, name, urlToIcon, parentCategory_id, root_category, has_children) VALUES(18, 'Exchange', '/resources/images/chrysler.png', 2,0,0);

  INSERT INTO categories_subcategories (category_id, subCategory_id) VALUES(2, 16);
  INSERT INTO categories_subcategories (category_id, subCategory_id) VALUES(2, 17);
  INSERT INTO categories_subcategories (category_id, subCategory_id) VALUES(2, 18);