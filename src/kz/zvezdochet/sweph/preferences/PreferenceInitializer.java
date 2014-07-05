package kz.zvezdochet.sweph.preferences;

import kz.zvezdochet.sweph.Activator;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Класс, определяющий значения настроек по умолчанию
 * @author Nataly
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.SE_EPHE_PATH, "/home/nataly/workspace/kz.zvezdochet.sweph/lib/ephe");
	}
}
