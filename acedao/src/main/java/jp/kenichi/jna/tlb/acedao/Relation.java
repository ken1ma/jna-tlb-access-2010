
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({D0B22D03-D05D-4C6D-8AB7-9392E84A87B9})</p>
 * <p>interface(_Relation)</p>
 */
@ComObject(clsId = "{D0B22D03-D05D-4C6D-8AB7-9392E84A87B9}")
public interface Relation extends IUnknown
    ,_Relation
{

}