drop table  VCICUSERINFO cascade constraints;
  create table VCICUSERINFO(
      USERID  number  constraint  VCIC_USER_ID_PK primary key,
      STAFFCODE  number constraint VCIC_STAFF_NAME_UK unique,
      STAFFNAME varchar2(24),
      AGE number,
      GENDER varchar2(6),
      DEPARTMENT varchar2(24),
      ONBORDINGDATE date
  );
  CREATE SEQUENCE seq_vcic_user_info_userid;
  select * from VCICUSERINFO;
