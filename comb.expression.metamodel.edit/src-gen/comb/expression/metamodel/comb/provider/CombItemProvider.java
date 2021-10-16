/**
 */
package comb.expression.metamodel.comb.provider;

import comb.expression.metamodel.comb.Comb;
import comb.expression.metamodel.comb.CombFactory;
import comb.expression.metamodel.comb.CombPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link comb.expression.metamodel.comb.Comb} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CombItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CombPackage.Literals.COMB__ELEMENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Comb.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Comb"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Comb_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Comb.class)) {
		case CombPackage.COMB__ELEMENT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createPrecedenceAfter_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createAbsenceAfter_until_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT, CombFactory.eINSTANCE.create_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createUniversalityBefore_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createPrecedenceBefore_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createUniversalityAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createBoundedExistenceAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createBoundedExistenceBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createBoundedExistenceGlobally_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.COMB__ELEMENT, CombFactory.eINSTANCE.createAbsenceBefore_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createUniversalityBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createResponseAfter_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createPrecedenceAfter_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT, CombFactory.eINSTANCE.createAlways_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createResponseBetween_and_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.COMB__ELEMENT, CombFactory.eINSTANCE.createResponseAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createPrecedenceBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createExistenceBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createExistenceAfter_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createResponseBefore_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT, CombFactory.eINSTANCE.create_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createAbsenceGlobally_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createAbsenceBetween_and_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT, CombFactory.eINSTANCE.create_or_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createBoundedExistenceAfter_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createExistenceAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createUniversalityAfter_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createResponseGlobally_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createExistenceGlobally_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createBoundedExistenceBefore_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.COMB__ELEMENT, CombFactory.eINSTANCE.createEventually_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT, CombFactory.eINSTANCE.create_implies_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createUniversalityGlobally_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.COMB__ELEMENT, CombFactory.eINSTANCE.createAbsenceAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createExistenceBefore_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createPrecedenceGlobally_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT, CombFactory.eINSTANCE.createLiteral()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT, CombFactory.eINSTANCE.createNext_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT, CombFactory.eINSTANCE.createNot_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createEventuallyWithin_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.create_untilWithin_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createAlwaysWithin_and_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.COMB__ELEMENT, CombFactory.eINSTANCE.create_untilWithin_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.COMB__ELEMENT, CombFactory.eINSTANCE.createAlwaysWithin_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createEventuallyWithin_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.COMB__ELEMENT, CombFactory.eINSTANCE.create_lessThan_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.create_lessThanOrEqual_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT, CombFactory.eINSTANCE.create_equal_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.COMB__ELEMENT, CombFactory.eINSTANCE.create_greaterThan_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.create_greaterThanOrEqual_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.COMB__ELEMENT, CombFactory.eINSTANCE.create_weakUntil_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createReach_by_InADistanceWithin_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createSomewhere_InADistanceWithin_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createEscapeBy_withADistanceOfAtLeast_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.COMB__ELEMENT,
				CombFactory.eINSTANCE.createEverywhere_InADistanceWithin_()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CombEditPlugin.INSTANCE;
	}

}
