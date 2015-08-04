package com.anyun.sample.db.doma.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.3.1" }, date = "2015-08-04T13:45:38.276+0800")
public final class _UserEntity extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.anyun.sample.db.doma.entity.UserEntity> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.3.1");
    }

    private static final _UserEntity __singleton = new _UserEntity();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    /** the id */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, com.anyun.sample.db.doma.entity.UserEntity, java.lang.String, Object> $id = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(com.anyun.sample.db.doma.entity.UserEntity.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "id", "ID", __namingType, false);

    /** the name */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.anyun.sample.db.doma.entity.UserEntity, java.lang.String, Object> $name = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.anyun.sample.db.doma.entity.UserEntity.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "name", "USER_NAME", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<com.anyun.sample.db.doma.entity.UserEntity>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.anyun.sample.db.doma.entity.UserEntity, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.anyun.sample.db.doma.entity.UserEntity, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.anyun.sample.db.doma.entity.UserEntity, ?>> __entityPropertyTypeMap;

    private _UserEntity() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "UserEntity";
        __catalogName = "";
        __schemaName = "";
        __tableName = "USER_INFO_BASE";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.anyun.sample.db.doma.entity.UserEntity, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.anyun.sample.db.doma.entity.UserEntity, ?>> __list = new java.util.ArrayList<>(2);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.anyun.sample.db.doma.entity.UserEntity, ?>> __map = new java.util.HashMap<>(2);
        __idList.add($id);
        __list.add($id);
        __map.put("id", $id);
        __list.add($name);
        __map.put("name", $name);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(com.anyun.sample.db.doma.entity.UserEntity entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.anyun.sample.db.doma.entity.UserEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.anyun.sample.db.doma.entity.UserEntity entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.anyun.sample.db.doma.entity.UserEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.anyun.sample.db.doma.entity.UserEntity entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.anyun.sample.db.doma.entity.UserEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.anyun.sample.db.doma.entity.UserEntity entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.anyun.sample.db.doma.entity.UserEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.anyun.sample.db.doma.entity.UserEntity entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.anyun.sample.db.doma.entity.UserEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.anyun.sample.db.doma.entity.UserEntity entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.anyun.sample.db.doma.entity.UserEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.anyun.sample.db.doma.entity.UserEntity, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.anyun.sample.db.doma.entity.UserEntity, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.anyun.sample.db.doma.entity.UserEntity, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.anyun.sample.db.doma.entity.UserEntity, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.anyun.sample.db.doma.entity.UserEntity, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.anyun.sample.db.doma.entity.UserEntity newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.anyun.sample.db.doma.entity.UserEntity, ?>> __args) {
        com.anyun.sample.db.doma.entity.UserEntity entity = new com.anyun.sample.db.doma.entity.UserEntity();
        __args.values().forEach(v -> v.save(entity));
        return entity;
    }

    @Override
    public Class<com.anyun.sample.db.doma.entity.UserEntity> getEntityClass() {
        return com.anyun.sample.db.doma.entity.UserEntity.class;
    }

    @Override
    public com.anyun.sample.db.doma.entity.UserEntity getOriginalStates(com.anyun.sample.db.doma.entity.UserEntity __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.anyun.sample.db.doma.entity.UserEntity __entity) {
    }

    /**
     * @return the singleton
     */
    public static _UserEntity getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _UserEntity newInstance() {
        return new _UserEntity();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<com.anyun.sample.db.doma.entity.UserEntity> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
