/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /root/research/snoopsnitch/SnoopSnitch/app/src/main/aidl/de/srlabs/snoopsnitch/qdmon/IMsdServiceCallback.aidl
 */
package de.srlabs.snoopsnitch.qdmon;
public interface IMsdServiceCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements de.srlabs.snoopsnitch.qdmon.IMsdServiceCallback
{
private static final java.lang.String DESCRIPTOR = "de.srlabs.snoopsnitch.qdmon.IMsdServiceCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an de.srlabs.snoopsnitch.qdmon.IMsdServiceCallback interface,
 * generating a proxy if needed.
 */
public static de.srlabs.snoopsnitch.qdmon.IMsdServiceCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof de.srlabs.snoopsnitch.qdmon.IMsdServiceCallback))) {
return ((de.srlabs.snoopsnitch.qdmon.IMsdServiceCallback)iin);
}
return new de.srlabs.snoopsnitch.qdmon.IMsdServiceCallback.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_stateChanged:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.stateChanged(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_internalError:
{
data.enforceInterface(DESCRIPTOR);
this.internalError();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements de.srlabs.snoopsnitch.qdmon.IMsdServiceCallback
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void stateChanged(java.lang.String reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(reason);
mRemote.transact(Stub.TRANSACTION_stateChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void internalError() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_internalError, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_stateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_internalError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void stateChanged(java.lang.String reason) throws android.os.RemoteException;
public void internalError() throws android.os.RemoteException;
}
