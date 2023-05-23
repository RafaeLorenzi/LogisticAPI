create table occurrence (
	id bigint not null auto_increment,
    delivery_id bigint not null,
    detail text not null,
    registration_date datetime not null,
    
    primary key (id)
);

alter table occurrence add constraint fk_delivery_occurrence
foreign key (delivery_id) references delivery (id);