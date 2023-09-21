// license-header java merge-point
// Generated by andromda-thymeleaf cartridge (controllers\ControllerImpl.java.vsl)
package bw.co.roguesystems.teseletso.menu;

import java.time.LocalDateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @see bw.co.roguesystems.teseletso.menu.MenuSectionController
 */
@Controller
@RequestMapping("/menu-section-controller")
public class MenuSectionControllerImpl
    extends MenuSectionControllerBase
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = -1656919026095585563L;

    public MenuSectionControllerImpl() {
        
        super(
        );
    }

    /**
     * @see bw.co.roguesystems.teseletso.menu.MenuSectionController#doInitialiseEditScreen(java.lang.Long id, MenuSectionVO menuSection)
     */
    @Override
    public void doInitialiseEditScreen(DoInitialiseEditScreenForm form, Model model)
    {
        // populating value with dummy instance
        MenuSectionVO menuSection = new MenuSectionVO();
        menuSection.setId(3355l);
        menuSection.setCreatedBy(null);
        menuSection.setUpdatedBy(null);
        menuSection.setCreatedDate(null);
        menuSection.setUpdatedDate(null);
        menuSection.setPosition(747804969);
        menuSection.setDisplayId(null);
        menuSection.setDisplayName(null);
        menuSection.setAuthorisations(null);
        form.setMenuSection(menuSection);
    }

    /**
     * @see bw.co.roguesystems.teseletso.menu.MenuSectionController#doDelete(MenuSectionVO menuSection)
     */
    @Override
    public void doDelete(DoDeleteForm form, Model model)
    {
        // populating value with dummy instance
        MenuSectionVO menuSection = new MenuSectionVO();
        menuSection.setId(3355l);
        menuSection.setCreatedBy(null);
        menuSection.setUpdatedBy(null);
        menuSection.setCreatedDate(null);
        menuSection.setUpdatedDate(null);
        menuSection.setPosition(747804969);
        menuSection.setDisplayId(null);
        menuSection.setDisplayName(null);
        menuSection.setAuthorisations(null);
        form.setMenuSection(menuSection);
    }

    /**
     * @see bw.co.roguesystems.teseletso.menu.MenuSectionController#doSave(MenuSectionVO menuSection)
     */
    @Override
    public void doSave(DoSaveForm form, Model model)
    {
        // populating value with dummy instance
        MenuSectionVO menuSection = new MenuSectionVO();
        menuSection.setId(3355l);
        menuSection.setCreatedBy(null);
        menuSection.setUpdatedBy(null);
        menuSection.setCreatedDate(null);
        menuSection.setUpdatedDate(null);
        menuSection.setPosition(747804969);
        menuSection.setDisplayId(null);
        menuSection.setDisplayName(null);
        menuSection.setAuthorisations(null);
        form.setMenuSection(menuSection);
    }

    /**
     * @see bw.co.roguesystems.teseletso.menu.MenuSectionController#doInitialiseSearchScreen()
     */
    @Override
    public void doInitialiseSearchScreen(Model model)
    {
    }

    /**
     * @see bw.co.roguesystems.teseletso.menu.MenuSectionController#doSearch(java.lang.String criteria)
     */
    @Override
    public void doSearch(DoSearchForm form, Model model)
    {
    }

    /**
     * @see bw.co.roguesystems.teseletso.menu.MenuSectionController#doEditGroup(java.lang.Long id)
     */
    @Override
    public void doEditGroup(DoEditGroupForm form, Model model)
    {
    }

    /**
     * This dummy variable is used to populate the "menuSections" table.
     * You may delete it when you add you own code in this controller.
     */
    private static final MenuSectionVO[] menuSections =
        new MenuSectionVO[]
        {
            new MenuSectionVO(null, "createdBy-1", "updatedBy-1", LocalDateTime.now(), LocalDateTime.now(), null, "displayId-1", "displayName-1", null),
            new MenuSectionVO(null, "createdBy-2", "updatedBy-2", LocalDateTime.now(), LocalDateTime.now(), null, "displayId-2", "displayName-2", null),
            new MenuSectionVO(null, "createdBy-3", "updatedBy-3", LocalDateTime.now(), LocalDateTime.now(), null, "displayId-3", "displayName-3", null),
            new MenuSectionVO(null, "createdBy-4", "updatedBy-4", LocalDateTime.now(), LocalDateTime.now(), null, "displayId-4", "displayName-4", null),
            new MenuSectionVO(null, "createdBy-5", "updatedBy-5", LocalDateTime.now(), LocalDateTime.now(), null, "displayId-5", "displayName-5", null)
        };
}