// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: Teseletso::backend::bw.co.roguesystems.teseletso::menu::MenuSectionService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.teseletso.menu;

import bw.co.roguesystems.teseletso.auth.AuthorisationDao;
import bw.co.roguesystems.teseletso.auth.AuthorisationRepository;
import java.util.Collection;
import java.util.Set;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.roguesystems.teseletso.menu.MenuSectionService
 */
@Service("menuSectionService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class MenuSectionServiceImpl
    extends MenuSectionServiceBase
{
    public MenuSectionServiceImpl(
        MenuSectionDao menuSection,
        MenuSectionRepository menuSectionRepository,
        AuthorisationDao authorisation,
        AuthorisationRepository authorisationRepository,
        MessageSource messageSource
    ) {
        
        super(
            menuSection,
            menuSectionRepository,
            authorisation,
            authorisationRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.teseletso.menu.MenuSectionService#save(MenuSectionVO)
     */
    @Override
    protected MenuSectionVO handleSave(MenuSectionVO menuSection)
        throws Exception
    {
        // TODO implement protected  MenuSectionVO handleSave(MenuSectionVO menuSection)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.menu.MenuSectionService.handleSave(MenuSectionVO menuSection) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.menu.MenuSectionService#getAll(Integer, Integer)
     */
    @Override
    protected Collection<MenuSectionVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Collection<MenuSectionVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.menu.MenuSectionService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.menu.MenuSectionService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.menu.MenuSectionService.handleRemove(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.menu.MenuSectionService#getAll()
     */
    @Override
    protected Collection<MenuSectionVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<MenuSectionVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.menu.MenuSectionService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.menu.MenuSectionService#search(String)
     */
    @Override
    protected Collection<MenuSectionVO> handleSearch(String criteria)
        throws Exception
    {
        // TODO implement protected  Collection<MenuSectionVO> handleSearch(String criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.menu.MenuSectionService.handleSearch(String criteria) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.menu.MenuSectionService#findById(Long)
     */
    @Override
    protected MenuSectionVO handleFindById(Long id)
        throws Exception
    {
        // TODO implement protected  MenuSectionVO handleFindById(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.menu.MenuSectionService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.menu.MenuSectionService#findByAuthorisationRoles(Set<String>)
     */
    @Override
    protected Collection<MenuSectionVO> handleFindByAuthorisationRoles(Set<String> roles)
        throws Exception
    {
        // TODO implement protected  Collection<MenuSectionVO> handleFindByAuthorisationRoles(Set<String> roles)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.menu.MenuSectionService.handleFindByAuthorisationRoles(Set<String> roles) Not implemented!");
    }

}