#存储过程：根据数据字典更新专线数据信息

drop PROCEDURE update_data_by_dict;
DELIMITER &&
CREATE PROCEDURE update_data_by_dict()
begin
declare no varchar(20); 
#1、专线类型
update xxbs_specline a inner join plat_dict_item b on  b.title = a.linetype set a.linetype = b.id;
#2、运营商类型
update xxbs_specline a inner join plat_dict_item b on  b.title = a.isptype set a.isptype = b.id;
#3、缴费方式
update xxbs_specline a inner join plat_dict_item b on  b.title = a.paytype set a.paytype = b.id;
#4、是否有专线
update xxbs_specline a set a.hasline = '1' where a.hasline='是';
update xxbs_specline a set a.hasline = '0' where a.hasline='否';
end &&
DELIMITER ;

