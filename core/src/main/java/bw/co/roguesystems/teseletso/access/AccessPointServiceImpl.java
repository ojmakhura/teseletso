// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: Teseletso::backend::bw.co.roguesystems.teseletso::access::AccessPointService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.teseletso.access;

import java.util.Collection;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.roguesystems.teseletso.access.AccessPointService
 */
@Service("accessPointService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class AccessPointServiceImpl
    extends AccessPointServiceBase
{
    public AccessPointServiceImpl(
        AccessPointDao accessPoint,
        AccessPointRepository accessPointRepository,
        MessageSource messageSource
    ) {
        
        super(
            accessPoint,
            accessPointRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.teseletso.access.AccessPointService#findById(Long)
     */
    @Override
    protected AccessPointVO handleFindById(Long id)
        throws Exception
    {
        // TODO implement protected  AccessPointVO handleFindById(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.access.AccessPointService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.access.AccessPointService#getAll()
     */
    @Override
    protected Collection<AccessPointVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<AccessPointVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.access.AccessPointService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.access.AccessPointService#getAll(Integer, Integer)
     */
    @Override
    protected Collection<AccessPointVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Collection<AccessPointVO> handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.access.AccessPointService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.access.AccessPointService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.access.AccessPointService.handleRemove(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.access.AccessPointService#save(AccessPointVO)
     */
    @Override
    protected AccessPointVO handleSave(AccessPointVO accessPoint)
        throws Exception
    {
        // TODO implement protected  AccessPointVO handleSave(AccessPointVO accessPoint)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.access.AccessPointService.handleSave(AccessPointVO accessPoint) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.access.AccessPointService#search(AccessPointCriteria)
     */
    @Override
    protected Collection<AccessPointVO> handleSearch(AccessPointCriteria criteria)
        throws Exception
    {
        // TODO implement protected  Collection<AccessPointVO> handleSearch(AccessPointCriteria criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.access.AccessPointService.handleSearch(AccessPointCriteria criteria) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.teseletso.access.AccessPointService#search(Integer, Integer, AccessPointCriteria)
     */
    @Override
    protected Page handleSearch(Integer pageNumber, Integer pageSize, AccessPointCriteria criteria)
        throws Exception
    {
        // TODO implement protected  Page handleSearch(Integer pageNumber, Integer pageSize, AccessPointCriteria criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.teseletso.access.AccessPointService.handleSearch(Integer pageNumber, Integer pageSize, AccessPointCriteria criteria) Not implemented!");
    }

}