/**
 */
package comb.expression.metamodel.comb.provider;

import comb.expression.metamodel.comb.CombFactory;
import comb.expression.metamodel.comb.CombPackage;
import comb.expression.metamodel.comb.ResponseTwoParams;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link comb.expression.metamodel.comb.ResponseTwoParams} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResponseTwoParamsItemProvider extends ResponseItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseTwoParamsItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q);
			childrenFeatures.add(CombPackage.Literals.RESPONSE_TWO_PARAMS__R);
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
		String label = ((ResponseTwoParams) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ResponseTwoParams_type")
				: getString("_UI_ResponseTwoParams_type") + " " + label;
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

		switch (notification.getFeatureID(ResponseTwoParams.class)) {
		case CombPackage.RESPONSE_TWO_PARAMS__Q:
		case CombPackage.RESPONSE_TWO_PARAMS__R:
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

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createPrecedenceAfter_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createAbsenceAfter_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.create_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createUniversalityBefore_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createPrecedenceBefore_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createUniversalityAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createBoundedExistenceAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createBoundedExistenceBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createBoundedExistenceGlobally_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createAbsenceBefore_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createUniversalityBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createResponseAfter_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createPrecedenceAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createAlways_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createResponseBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createResponseAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createPrecedenceBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createExistenceBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createExistenceAfter_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createResponseBefore_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q, CombFactory.eINSTANCE.create_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createAbsenceGlobally_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createAbsenceBetween_and_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q, CombFactory.eINSTANCE.create_or_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createBoundedExistenceAfter_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createExistenceAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createUniversalityAfter_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createResponseGlobally_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createExistenceGlobally_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createBoundedExistenceBefore_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createEventually_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.create_implies_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createUniversalityGlobally_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createAbsenceAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createExistenceBefore_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createPrecedenceGlobally_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q, CombFactory.eINSTANCE.createNext_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q, CombFactory.eINSTANCE.createNot_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createEventuallyWithin_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.create_untilWithin_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createAlwaysWithin_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.create_untilWithin_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createAlwaysWithin_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createEventuallyWithin_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.create_lessThan_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.create_lessThanOrEqual_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.create_equal_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.create_greaterThan_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.create_greaterThanOrEqual_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.create_weakUntil_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createReach_by_InADistanceWithin_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createSomewhere_InADistanceWithin_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createEscapeBy_withADistanceOfAtLeast_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__Q,
				CombFactory.eINSTANCE.createEverywhere_InADistanceWithin_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createPrecedenceAfter_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createAbsenceAfter_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.create_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createUniversalityBefore_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createPrecedenceBefore_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createUniversalityAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createBoundedExistenceAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createBoundedExistenceBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createBoundedExistenceGlobally_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createAbsenceBefore_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createUniversalityBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createResponseAfter_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createPrecedenceAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createAlways_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createResponseBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createResponseAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createPrecedenceBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createExistenceBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createExistenceAfter_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createResponseBefore_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R, CombFactory.eINSTANCE.create_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createAbsenceGlobally_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createAbsenceBetween_and_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R, CombFactory.eINSTANCE.create_or_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createBoundedExistenceAfter_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createExistenceAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createUniversalityAfter_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createResponseGlobally_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createExistenceGlobally_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createBoundedExistenceBefore_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createEventually_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.create_implies_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createUniversalityGlobally_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createAbsenceAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createExistenceBefore_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createPrecedenceGlobally_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R, CombFactory.eINSTANCE.createNext_()));

		newChildDescriptors.add(
				createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R, CombFactory.eINSTANCE.createNot_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createEventuallyWithin_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.create_untilWithin_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createAlwaysWithin_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.create_untilWithin_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createAlwaysWithin_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createEventuallyWithin_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.create_lessThan_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.create_lessThanOrEqual_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.create_equal_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.create_greaterThan_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.create_greaterThanOrEqual_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.create_weakUntil_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createReach_by_InADistanceWithin_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createSomewhere_InADistanceWithin_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createEscapeBy_withADistanceOfAtLeast_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.RESPONSE_TWO_PARAMS__R,
				CombFactory.eINSTANCE.createEverywhere_InADistanceWithin_()));
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

		boolean qualify = childFeature == CombPackage.Literals.LTL_OPERATORS__P
				|| childFeature == CombPackage.Literals.ORDER__S
				|| childFeature == CombPackage.Literals.RESPONSE_TWO_PARAMS__Q
				|| childFeature == CombPackage.Literals.RESPONSE_TWO_PARAMS__R;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
