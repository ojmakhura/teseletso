// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: Teseletso::backend::bw.co.roguesystems.teseletso::access::type::AccessPointTypeService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.teseletso.access.type;

import java.util.Collection;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.roguesystems.teseletso.access.type.AccessPointTypeService
 */
@Service("accessPointTypeService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class AccessPointTypeServiceImpl
    extends AccessPointTypeServiceBase
{
    public AccessPointTypeServiceImpl(
        AccessPointTypeDao accessPointType,
        AccessPointTypeRepository accessPointTypeRepository,
        MessageSource messageSource
    ) {
        
        super(
            accessPointType,
            accessPointTypeRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.teseletso.access.type.AccessPointTypeService#findById(Long)
     */
    @Override
    protected AccessPointTypeVO handleFindById(Long id)
        throws Exception
    {
        // TODO implement protected  AccessPointTypeVO handleFindById(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.access.type.AccessPointTypeService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.access.type.AccessPointTypeService#save(AccessPointTypeVO)
     */
    @Override
    protected AccessPointTypeVO handleSave(AccessPointTypeVO accessPointType)
        throws Exception
    {
        // TODO implement protected  AccessPointTypeVO handleSave(AccessPointTypeVO accessPointType)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.access.type.AccessPointTypeService.handleSave(AccessPointTypeVO accessPointType) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.access.type.AccessPointTypeService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.access.type.AccessPointTypeService.handleRemove(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.access.type.AccessPointTypeService#getAll()
     */
    @Override
    protected Collection<AccessPointTypeVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<AccessPointTypeVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.access.type.AccessPointTypeService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.access.type.AccessPointTypeService#search(String)
     */
    @Override
    protected Collection<AccessPointTypeVO> handleSearch(String criteria)
        throws Exception
    {
        // TODO implement protected  Collection<AccessPointTypeVO> handleSearch(String criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.access.type.AccessPointTypeService.handleSearch(String criteria) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.access.type.AccessPointTypeService#getAll(Integer, Integer)
     */
    @Override
    protected Collection<AccessPointTypeVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Collection<AccessPointTypeVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.access.type.AccessPointTypeService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.access.type.AccessPointTypeService#search(Integer, Integer, String)
     */
    @Override
    protected Page handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throws Exception
    {
        // TODO implement protected  Page handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.access.type.AccessPointTypeService.handleSearch(Integer pageNumber, Integer pageSize, String criteria) Not implemented!");
    }

}