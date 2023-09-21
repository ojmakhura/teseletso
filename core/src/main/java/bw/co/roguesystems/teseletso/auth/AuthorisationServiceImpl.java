// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: Teseletso::backend::bw.co.roguesystems.teseletso::auth::AuthorisationService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.teseletso.auth;

import bw.co.roguesystems.teseletso.menu.MenuSectionDao;
import bw.co.roguesystems.teseletso.menu.MenuSectionRepository;
import java.util.Collection;
import java.util.Set;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.roguesystems.teseletso.auth.AuthorisationService
 */
@Service("authorisationService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class AuthorisationServiceImpl
    extends AuthorisationServiceBase
{
    public AuthorisationServiceImpl(
        AuthorisationDao authorisation,
        AuthorisationRepository authorisationRepository,
        MenuSectionDao menuSection,
        MenuSectionRepository menuSectionRepository,
        MessageSource messageSource
    ) {
        
        super(
            authorisation,
            authorisationRepository,
            menuSection,
            menuSectionRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.teseletso.auth.AuthorisationService#findById(Long)
     */
    @Override
    protected AuthorisationVO handleFindById(Long id)
        throws Exception
    {
        // TODO implement protected  AuthorisationVO handleFindById(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.auth.AuthorisationService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.auth.AuthorisationService#save(AuthorisationVO)
     */
    @Override
    protected AuthorisationVO handleSave(AuthorisationVO authorisation)
        throws Exception
    {
        // TODO implement protected  AuthorisationVO handleSave(AuthorisationVO authorisation)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.auth.AuthorisationService.handleSave(AuthorisationVO authorisation) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.auth.AuthorisationService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.auth.AuthorisationService.handleRemove(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.auth.AuthorisationService#getAll()
     */
    @Override
    protected Collection<AuthorisationVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<AuthorisationVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.auth.AuthorisationService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.auth.AuthorisationService#search(AuthorisationCriteria)
     */
    @Override
    protected Collection<AuthorisationVO> handleSearch(AuthorisationCriteria criteria)
        throws Exception
    {
        // TODO implement protected  Collection<AuthorisationVO> handleSearch(AuthorisationCriteria criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.auth.AuthorisationService.handleSearch(AuthorisationCriteria criteria) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.auth.AuthorisationService#getAll(Integer, Integer)
     */
    @Override
    protected Collection<AuthorisationVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Collection<AuthorisationVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.auth.AuthorisationService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.auth.AuthorisationService#getAccessTypeCodeAuthorisations(Set<String>, Set<String>)
     */
    @Override
    protected Collection<AuthorisationVO> handleGetAccessTypeCodeAuthorisations(Set<String> roles, Set<String> accessPointTypeCodes)
        throws Exception
    {
        // TODO implement protected  Collection<AuthorisationVO> handleGetAccessTypeCodeAuthorisations(Set<String> roles, Set<String> accessPointTypeCodes)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.auth.AuthorisationService.handleGetAccessTypeCodeAuthorisations(Set<String> roles, Set<String> accessPointTypeCodes) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.auth.AuthorisationService#assignMenuSection(Long, Long)
     */
    @Override
    protected AuthorisationVO handleAssignMenuSection(Long authorisationId, Long menuSectionId)
        throws Exception
    {
        // TODO implement protected  AuthorisationVO handleAssignMenuSection(Long authorisationId, Long menuSectionId)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.auth.AuthorisationService.handleAssignMenuSection(Long authorisationId, Long menuSectionId) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.auth.AuthorisationService#findByRolesAndUrl(String, Set<String>)
     */
    @Override
    protected Collection<AuthorisationVO> handleFindByRolesAndUrl(String url, Set<String> roles)
        throws Exception
    {
        // TODO implement protected  Collection<AuthorisationVO> handleFindByRolesAndUrl(String url, Set<String> roles)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.auth.AuthorisationService.handleFindByRolesAndUrl(String url, Set<String> roles) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.auth.AuthorisationService#findByUrlPrefix(String)
     */
    @Override
    protected Collection<AuthorisationVO> handleFindByUrlPrefix(String prefix)
        throws Exception
    {
        // TODO implement protected  Collection<AuthorisationVO> handleFindByUrlPrefix(String prefix)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.auth.AuthorisationService.handleFindByUrlPrefix(String prefix) Not implemented!");
    }

}