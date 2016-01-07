
ALTER TABLE province add faraway TINYINT(1) DEFAULT 0;

update province p set p.faraway=1 where p.province_id in ('31','30' ,'26' ,'25' ,'28' ,'5' ,'21' ,'32'  ,'33','34' );