
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({7398AAFD-6527-48C7-95B7-BEABACD1CA3F})</p>
 * <p>source(_FormEvents2)</p>
 * <p>source(_FormEvents)</p>
 * <p>interface(_Form3)</p>
 * <p>interface(IConnectionPoint)</p>
 */
@ComObject(clsId = "{7398AAFD-6527-48C7-95B7-BEABACD1CA3F}")
public interface Form extends IUnknown
    ,_Form3
    ,IConnectionPoint
{

}