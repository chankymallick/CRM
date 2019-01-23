-- ****************** SqlDBM: Microsoft SQL Server ******************
-- ******************************************************************

-- ************************************** [dbo].[USERS]

CREATE TABLE [dbo].[USERS]
(
 [USER_UID]        int IDENTITY (1, 1) NOT NULL ,
 [EMAIL]           varchar(50) NOT NULL ,
 [NAME]            varchar(50) NOT NULL ,
 [MOBILE_PREFIX]   varchar(5) NOT NULL ,
 [MOBILE_NO]       int NOT NULL ,
 [PASSWORD]        nvarchar(20) NOT NULL ,
 [USER_ROLE]       varchar(15) NOT NULL ,
 [ACTIVE]          bit NOT NULL ,
 [PROFILE_PICTURE] int NOT NULL ,
 [IMAGE_UID]       int NOT NULL ,
 [CREATED_BY]      int NOT NULL ,
 [CREATED_DATE]    datetime NOT NULL ,
 [MODIFIED_BY]     int NOT NULL ,
 [MODIFIED_DATE]   datetime NOT NULL ,

 CONSTRAINT [PK_USERS] PRIMARY KEY CLUSTERED ([USER_UID] ASC),
 CONSTRAINT [FK_28] FOREIGN KEY ([IMAGE_UID])  REFERENCES [IMAGE_STORE]([IMAGE_UID])
);
GO


CREATE NONCLUSTERED INDEX [fkIdx_28] ON [dbo].[USERS] 
 (
  [IMAGE_UID] ASC
 )

GO







