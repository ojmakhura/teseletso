// Generated by hibernate/SpringHibernateDaoImpl.vsl in andromda-spring-cartridge on $springUtils.date.
// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package bw.co.roguesystems.teseletso.auth;

import bw.co.roguesystems.teseletso.access.AccessPointRepository;
import bw.co.roguesystems.teseletso.access.type.AccessPointTypeRepository;
import bw.co.roguesystems.teseletso.menu.MenuSectionRepository;
import org.springframework.stereotype.Repository;

/**
 * @see Authorisation
 */
@Repository("authorisationDao")
public class AuthorisationDaoImpl
    extends AuthorisationDaoBase
{
    
    public AuthorisationDaoImpl(
        AccessPointRepository accessPointRepository,
        AccessPointTypeRepository accessPointTypeRepository,
        MenuSectionRepository menuSectionRepository,
        AuthorisationRepository authorisationRepository
    ) {

        super(
            accessPointRepository,
            accessPointTypeRepository,
            menuSectionRepository,
            authorisationRepository
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void toAuthorisationVO(
        Authorisation source,
        AuthorisationVO target)
    {
        // TODO verify behavior of toAuthorisationVO
        super.toAuthorisationVO(source, target);
        // WARNING! No conversion for target.accessPoint (can't convert source.getAccessPoint():bw.co.roguesystems.teseletso.access.AccessPoint to bw.co.roguesystems.teseletso.access.AccessPointVO
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorisationVO toAuthorisationVO(final Authorisation entity)
    {
        // TODO verify behavior of toAuthorisationVO
        return super.toAuthorisationVO(entity);
    }

    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private Authorisation loadAuthorisationFromAuthorisationVO(AuthorisationVO authorisationVO)
    {
        // TODO implement loadAuthorisationFromAuthorisationVO
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.auth.loadAuthorisationFromAuthorisationVO(AuthorisationVO) not yet implemented.");

        /* A typical implementation looks like this:
        if (authorisationVO.getId() == null)
        {
            return  Authorisation.Factory.newInstance();
        }
        else
        {
            return this.load(authorisationVO.getId());
        }
        */
    }

    /**
     * {@inheritDoc}
     */
    public Authorisation authorisationVOToEntity(AuthorisationVO authorisationVO)
    {
        // TODO verify behavior of authorisationVOToEntity
        Authorisation entity = this.loadAuthorisationFromAuthorisationVO(authorisationVO);
        this.authorisationVOToEntity(authorisationVO, entity, true);
        return entity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void authorisationVOToEntity(
        AuthorisationVO source,
        Authorisation target,
        boolean copyIfNull)
    {
        // TODO verify behavior of authorisationVOToEntity
        super.authorisationVOToEntity(source, target, copyIfNull);
    }
}