/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /root/research/snoopsnitch/SnoopSnitch/app/src/main/aidl/de/srlabs/snoopsnitch/active_test/IActiveTestCallback.aidl
 */
package de.srlabs.snoopsnitch.active_test;
public interface IActiveTestCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements de.srlabs.snoopsnitch.active_test.IActiveTestCallback
{
private static final java.lang.String DESCRIPTOR = "de.srlabs.snoopsnitch.active_test.IActiveTestCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an de.srlabs.snoopsnitch.active_test.IActiveTestCallback interface,
 * generating a proxy if needed.
 */
public static de.srlabs.snoopsnitch.active_test.IActiveTestCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof de.srlabs.snoopsnitch.active_test.IActiveTestCallback))) {
return ((de.srlabs.snoopsnitch.active_test.IActiveTestCallback)iin);
}
return new de.srlabs.snoopsnitch.active_test.IActiveTestCallback.Stub.Proxy(obj);
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
case TRANSACTION_testResultsChanged:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.testResultsChanged(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_testStateChanged:
{
data.enforceInterface(DESCRIPTOR);
this.testStateChanged();
reply.writeNoException();
return true;
}
case TRANSACTION_deviceIncompatibleDetected:
{
data.enforceInterface(DESCRIPTOR);
this.deviceIncompatibleDetected();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements de.srlabs.snoopsnitch.active_test.IActiveTestCallback
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
@Override public void testResultsChanged(android.os.Bundle b) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((b!=null)) {
_data.writeInt(1);
b.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_testResultsChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void testStateChanged() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_testStateChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void deviceIncompatibleDetected() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_deviceIncompatibleDetected, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_testResultsChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_testStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_deviceIncompatibleDetected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public void testResultsChanged(android.os.Bundle b) throws android.os.RemoteException;
public void testStateChanged() throws android.os.RemoteException;
public void deviceIncompatibleDetected() throws android.os.RemoteException;
}
