package com.anyun.sample.db.doma.dao;

/** */
@org.springframework.stereotype.Component()
@javax.annotation.Generated(value = { "Doma", "2.3.1" }, date = "2015-08-04T13:45:38.347+0800")
public class UserDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.anyun.sample.db.doma.dao.UserDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.3.1");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.anyun.sample.db.doma.dao.UserDao.class, "selectAll");

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.anyun.sample.db.doma.dao.UserDao.class, "insert", com.anyun.sample.db.doma.entity.UserEntity.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public UserDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<com.anyun.sample.db.doma.entity.UserEntity> selectAll() {
        entering("com.anyun.sample.db.doma.dao.UserDaoImpl", "selectAll");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/anyun/sample/db/doma/dao/UserDao/selectAll.sql");
            __query.setEntityType(com.anyun.sample.db.doma.entity._UserEntity.getSingletonInternal());
            __query.setCallerClassName("com.anyun.sample.db.doma.dao.UserDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<com.anyun.sample.db.doma.entity.UserEntity>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.anyun.sample.db.doma.entity.UserEntity>(com.anyun.sample.db.doma.entity._UserEntity.getSingletonInternal()));
            java.util.List<com.anyun.sample.db.doma.entity.UserEntity> __result = __command.execute();
            __query.complete();
            exiting("com.anyun.sample.db.doma.dao.UserDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.anyun.sample.db.doma.dao.UserDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public int insert(com.anyun.sample.db.doma.entity.UserEntity user) throws java.lang.Exception {
        entering("com.anyun.sample.db.doma.dao.UserDaoImpl", "insert", user);
        try {
            if (user == null) {
                throw new org.seasar.doma.DomaNullPointerException("user");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<com.anyun.sample.db.doma.entity.UserEntity> __query = getQueryImplementors().createAutoInsertQuery(__method1, com.anyun.sample.db.doma.entity._UserEntity.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setEntity(user);
            __query.setCallerClassName("com.anyun.sample.db.doma.dao.UserDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method1, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.anyun.sample.db.doma.dao.UserDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.anyun.sample.db.doma.dao.UserDaoImpl", "insert", __e);
            throw __e;
        }
    }

}
