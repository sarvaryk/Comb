/**
 */
package comb.expression.metamodel.comb.provider;

import comb.expression.metamodel.comb.CombFactory;
import comb.expression.metamodel.comb.CombPackage;
import comb.expression.metamodel.comb.Order;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link comb.expression.metamodel.comb.Order} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OrderItemProvider extends ElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CombPackage.Literals.ORDER__P);
			childrenFeatures.add(CombPackage.Literals.ORDER__S);
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
		String label = ((Order) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Order_type")
				: getString("_UI_Order_type") + " " + label;
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

		switch (notification.getFeatureID(Order.class)) {
		case CombPackage.ORDER__P:
		case CombPackage.ORDER__S:
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

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__P,
				CombFactory.eINSTANCE.createPrecedenceAfter_until_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.createAbsenceAfter_until_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.create_until_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.createUniversalityBefore_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.createPrecedenceBefore_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.createUniversalityAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__P,
				CombFactory.eINSTANCE.createBoundedExistenceAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__P,
				CombFactory.eINSTANCE.createBoundedExistenceBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__P,
				CombFactory.eINSTANCE.createBoundedExistenceGlobally_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.createAbsenceBefore_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__P,
				CombFactory.eINSTANCE.createUniversalityBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__P,
				CombFactory.eINSTANCE.createResponseAfter_until_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.createPrecedenceAfter_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.createAlways_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__P,
				CombFactory.eINSTANCE.createResponseBetween_and_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.createResponseAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__P,
				CombFactory.eINSTANCE.createPrecedenceBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__P,
				CombFactory.eINSTANCE.createExistenceBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__P,
				CombFactory.eINSTANCE.createExistenceAfter_until_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.createResponseBefore_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.create_and_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.createAbsenceGlobally_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.createAbsenceBetween_and_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.create_or_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__P,
				CombFactory.eINSTANCE.createBoundedExistenceAfter_until_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.createExistenceAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__P,
				CombFactory.eINSTANCE.createUniversalityAfter_until_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.createResponseGlobally_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.createExistenceGlobally_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__P,
				CombFactory.eINSTANCE.createBoundedExistenceBefore_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.createEventually_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.create_implies_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__P,
				CombFactory.eINSTANCE.createUniversalityGlobally_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.createAbsenceAfter_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.createExistenceBefore_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.createPrecedenceGlobally_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.createLiteral()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.createNext_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.createNot_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__P,
				CombFactory.eINSTANCE.createEventuallyWithin_and_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.create_untilWithin_and_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.createAlwaysWithin_and_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.create_untilWithin_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.createAlwaysWithin_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.createEventuallyWithin_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.create_lessThan_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.create_lessThanOrEqual_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.create_equal_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__P, CombFactory.eINSTANCE.create_greaterThan_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__P,
				CombFactory.eINSTANCE.create_greaterThanOrEqual_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__S,
				CombFactory.eINSTANCE.createPrecedenceAfter_until_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.createAbsenceAfter_until_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.create_until_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.createUniversalityBefore_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.createPrecedenceBefore_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.createUniversalityAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__S,
				CombFactory.eINSTANCE.createBoundedExistenceAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__S,
				CombFactory.eINSTANCE.createBoundedExistenceBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__S,
				CombFactory.eINSTANCE.createBoundedExistenceGlobally_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.createAbsenceBefore_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__S,
				CombFactory.eINSTANCE.createUniversalityBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__S,
				CombFactory.eINSTANCE.createResponseAfter_until_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.createPrecedenceAfter_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.createAlways_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__S,
				CombFactory.eINSTANCE.createResponseBetween_and_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.createResponseAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__S,
				CombFactory.eINSTANCE.createPrecedenceBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__S,
				CombFactory.eINSTANCE.createExistenceBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__S,
				CombFactory.eINSTANCE.createExistenceAfter_until_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.createResponseBefore_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.create_and_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.createAbsenceGlobally_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.createAbsenceBetween_and_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.create_or_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__S,
				CombFactory.eINSTANCE.createBoundedExistenceAfter_until_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.createExistenceAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__S,
				CombFactory.eINSTANCE.createUniversalityAfter_until_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.createResponseGlobally_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.createExistenceGlobally_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__S,
				CombFactory.eINSTANCE.createBoundedExistenceBefore_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.createEventually_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.create_implies_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__S,
				CombFactory.eINSTANCE.createUniversalityGlobally_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.createAbsenceAfter_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.createExistenceBefore_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.createPrecedenceGlobally_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.createLiteral()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.createNext_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.createNot_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__S,
				CombFactory.eINSTANCE.createEventuallyWithin_and_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.create_untilWithin_and_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.createAlwaysWithin_and_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.create_untilWithin_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.createAlwaysWithin_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.createEventuallyWithin_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.create_lessThan_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.create_lessThanOrEqual_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.create_equal_()));

		newChildDescriptors
				.add(createChildParameter(CombPackage.Literals.ORDER__S, CombFactory.eINSTANCE.create_greaterThan_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.ORDER__S,
				CombFactory.eINSTANCE.create_greaterThanOrEqual_()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == CombPackage.Literals.ORDER__P
				|| childFeature == CombPackage.Literals.ORDER__S;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
