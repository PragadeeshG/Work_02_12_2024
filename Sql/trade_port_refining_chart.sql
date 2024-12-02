create table if not exists trade_port_refining_chart(
data_portfolio_code Integer not null,
trade_port_refining_id Integer null,
trade_port_refining_budget_indicator varchar(255) null,
trade_port_refining_sheet varchar(255) null,
trade_port_refining_control_flag varchar(255) null,
trade_port_refining_desc varchar(255) null,
trade_port_refining_short_desc varchar(255) null,
trade_port_refining_type varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint trade_port_refining_chart_pk primary key(data_portfolio_code));