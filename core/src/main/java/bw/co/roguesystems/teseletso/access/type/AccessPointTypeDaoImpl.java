// Generated by hibernate/SpringHibernateDaoImpl.vsl in andromda-spring-cartridge on $springUtils.date.
// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package bw.co.roguesystems.teseletso.access.type;

import java.util.Collection;
import org.springframework.stereotype.Repository;

/**
 * @see AccessPointType
 */
@Repository("accessPointTypeDao")
public class AccessPointTypeDaoImpl
    extends AccessPointTypeDaoBase
{
    
    public AccessPointTypeDaoImpl(
        AccessPointTypeRepository accessPointTypeRepository
    ) {

        super(
            accessPointTypeRepository
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Collection<AccessPointType> handleFindByCriteria(String criteria)
    {
        // TODO implement public Collection<AccessPointType> handleFindByCriteria(String criteria)
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void toAccessPointTypeVO(
        AccessPointType source,
        AccessPointTypeVO target)
    {
        // TODO verify behavior of toAccessPointTypeVO
        super.toAccessPointTypeVO(source, target);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccessPointTypeVO toAccessPointTypeVO(final AccessPointType entity)
    {
        // TODO verify behavior of toAccessPointTypeVO
        return super.toAccessPointTypeVO(entity);
    }

    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private AccessPointType loadAccessPointTypeFromAccessPointTypeVO(AccessPointTypeVO accessPointTypeVO)
    {
        // TODO implement loadAccessPointTypeFromAccessPointTypeVO
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.access.type.loadAccessPointTypeFromAccessPointTypeVO(AccessPointTypeVO) not yet implemented.");

        /* A typical implementation looks like this:
        if (accessPointTypeVO.getId() == null)
        {
            return  AccessPointType.Factory.newInstance();
        }
        else
        {
            return this.load(accessPointTypeVO.getId());
        }
        */
    }

    /**
     * {@inheritDoc}
     */
    public AccessPointType accessPointTypeVOToEntity(AccessPointTypeVO accessPointTypeVO)
    {
        // TODO verify behavior of accessPointTypeVOToEntity
        AccessPointType entity = this.loadAccessPointTypeFromAccessPointTypeVO(accessPointTypeVO);
        this.accessPointTypeVOToEntity(accessPointTypeVO, entity, true);
        return entity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void accessPointTypeVOToEntity(
        AccessPointTypeVO source,
        AccessPointType target,
        boolean copyIfNull)
    {
        // TODO verify behavior of accessPointTypeVOToEntity
        super.accessPointTypeVOToEntity(source, target, copyIfNull);
    }
}