// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: Teseletso::backend::bw.co.roguesystems.teseletso::auth::AccessControl
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.teseletso.auth;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.roguesystems.teseletso.auth.AccessControl
 */
@Service("accessControl")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class AccessControlImpl
    extends AccessControlBase
{
    public AccessControlImpl(
        @Lazy AuthorisationService authorisationService,
        MessageSource messageSource
    ) {
        
        super(
            authorisationService,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.teseletso.auth.AccessControl#authorised(String)
     */
    @Override
    protected boolean handleAuthorised(String url)
        throws Exception
    {
        // TODO implement protected  boolean handleAuthorised(String url)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.auth.AccessControl.handleAuthorised(String url) Not implemented!");
    }

}