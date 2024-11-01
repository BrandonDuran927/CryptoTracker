package com.example.cryptotracker.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.plcoding.cryptotracker.ui.theme.Typography
import com.plcoding.cryptotracker.ui.theme.backgroundDark
import com.plcoding.cryptotracker.ui.theme.backgroundDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.backgroundDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.backgroundLight
import com.plcoding.cryptotracker.ui.theme.backgroundLightHighContrast
import com.plcoding.cryptotracker.ui.theme.backgroundLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.errorContainerDark
import com.plcoding.cryptotracker.ui.theme.errorContainerDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.errorContainerDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.errorContainerLight
import com.plcoding.cryptotracker.ui.theme.errorContainerLightHighContrast
import com.plcoding.cryptotracker.ui.theme.errorContainerLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.errorDark
import com.plcoding.cryptotracker.ui.theme.errorDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.errorDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.errorLight
import com.plcoding.cryptotracker.ui.theme.errorLightHighContrast
import com.plcoding.cryptotracker.ui.theme.errorLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.inverseOnSurfaceDark
import com.plcoding.cryptotracker.ui.theme.inverseOnSurfaceDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.inverseOnSurfaceDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.inverseOnSurfaceLight
import com.plcoding.cryptotracker.ui.theme.inverseOnSurfaceLightHighContrast
import com.plcoding.cryptotracker.ui.theme.inverseOnSurfaceLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.inversePrimaryDark
import com.plcoding.cryptotracker.ui.theme.inversePrimaryDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.inversePrimaryDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.inversePrimaryLight
import com.plcoding.cryptotracker.ui.theme.inversePrimaryLightHighContrast
import com.plcoding.cryptotracker.ui.theme.inversePrimaryLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.inverseSurfaceDark
import com.plcoding.cryptotracker.ui.theme.inverseSurfaceDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.inverseSurfaceDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.inverseSurfaceLight
import com.plcoding.cryptotracker.ui.theme.inverseSurfaceLightHighContrast
import com.plcoding.cryptotracker.ui.theme.inverseSurfaceLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.onBackgroundDark
import com.plcoding.cryptotracker.ui.theme.onBackgroundDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.onBackgroundDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.onBackgroundLight
import com.plcoding.cryptotracker.ui.theme.onBackgroundLightHighContrast
import com.plcoding.cryptotracker.ui.theme.onBackgroundLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.onErrorContainerDark
import com.plcoding.cryptotracker.ui.theme.onErrorContainerDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.onErrorContainerDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.onErrorContainerLight
import com.plcoding.cryptotracker.ui.theme.onErrorContainerLightHighContrast
import com.plcoding.cryptotracker.ui.theme.onErrorContainerLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.onErrorDark
import com.plcoding.cryptotracker.ui.theme.onErrorDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.onErrorDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.onErrorLight
import com.plcoding.cryptotracker.ui.theme.onErrorLightHighContrast
import com.plcoding.cryptotracker.ui.theme.onErrorLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.onPrimaryContainerDark
import com.plcoding.cryptotracker.ui.theme.onPrimaryContainerDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.onPrimaryContainerDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.onPrimaryContainerLight
import com.plcoding.cryptotracker.ui.theme.onPrimaryContainerLightHighContrast
import com.plcoding.cryptotracker.ui.theme.onPrimaryContainerLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.onPrimaryDark
import com.plcoding.cryptotracker.ui.theme.onPrimaryDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.onPrimaryDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.onPrimaryLight
import com.plcoding.cryptotracker.ui.theme.onPrimaryLightHighContrast
import com.plcoding.cryptotracker.ui.theme.onPrimaryLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.onSecondaryContainerDark
import com.plcoding.cryptotracker.ui.theme.onSecondaryContainerDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.onSecondaryContainerDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.onSecondaryContainerLight
import com.plcoding.cryptotracker.ui.theme.onSecondaryContainerLightHighContrast
import com.plcoding.cryptotracker.ui.theme.onSecondaryContainerLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.onSecondaryDark
import com.plcoding.cryptotracker.ui.theme.onSecondaryDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.onSecondaryDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.onSecondaryLight
import com.plcoding.cryptotracker.ui.theme.onSecondaryLightHighContrast
import com.plcoding.cryptotracker.ui.theme.onSecondaryLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.onSurfaceDark
import com.plcoding.cryptotracker.ui.theme.onSurfaceDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.onSurfaceDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.onSurfaceLight
import com.plcoding.cryptotracker.ui.theme.onSurfaceLightHighContrast
import com.plcoding.cryptotracker.ui.theme.onSurfaceLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.onSurfaceVariantDark
import com.plcoding.cryptotracker.ui.theme.onSurfaceVariantDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.onSurfaceVariantDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.onSurfaceVariantLight
import com.plcoding.cryptotracker.ui.theme.onSurfaceVariantLightHighContrast
import com.plcoding.cryptotracker.ui.theme.onSurfaceVariantLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.onTertiaryContainerDark
import com.plcoding.cryptotracker.ui.theme.onTertiaryContainerDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.onTertiaryContainerDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.onTertiaryContainerLight
import com.plcoding.cryptotracker.ui.theme.onTertiaryContainerLightHighContrast
import com.plcoding.cryptotracker.ui.theme.onTertiaryContainerLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.onTertiaryDark
import com.plcoding.cryptotracker.ui.theme.onTertiaryDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.onTertiaryDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.onTertiaryLight
import com.plcoding.cryptotracker.ui.theme.onTertiaryLightHighContrast
import com.plcoding.cryptotracker.ui.theme.onTertiaryLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.outlineDark
import com.plcoding.cryptotracker.ui.theme.outlineDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.outlineDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.outlineLight
import com.plcoding.cryptotracker.ui.theme.outlineLightHighContrast
import com.plcoding.cryptotracker.ui.theme.outlineLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.outlineVariantDark
import com.plcoding.cryptotracker.ui.theme.outlineVariantDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.outlineVariantDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.outlineVariantLight
import com.plcoding.cryptotracker.ui.theme.outlineVariantLightHighContrast
import com.plcoding.cryptotracker.ui.theme.outlineVariantLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.primaryContainerDark
import com.plcoding.cryptotracker.ui.theme.primaryContainerDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.primaryContainerDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.primaryContainerLight
import com.plcoding.cryptotracker.ui.theme.primaryContainerLightHighContrast
import com.plcoding.cryptotracker.ui.theme.primaryContainerLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.primaryDark
import com.plcoding.cryptotracker.ui.theme.primaryDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.primaryDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.primaryLight
import com.plcoding.cryptotracker.ui.theme.primaryLightHighContrast
import com.plcoding.cryptotracker.ui.theme.primaryLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.scrimDark
import com.plcoding.cryptotracker.ui.theme.scrimDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.scrimDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.scrimLight
import com.plcoding.cryptotracker.ui.theme.scrimLightHighContrast
import com.plcoding.cryptotracker.ui.theme.scrimLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.secondaryContainerDark
import com.plcoding.cryptotracker.ui.theme.secondaryContainerDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.secondaryContainerDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.secondaryContainerLight
import com.plcoding.cryptotracker.ui.theme.secondaryContainerLightHighContrast
import com.plcoding.cryptotracker.ui.theme.secondaryContainerLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.secondaryDark
import com.plcoding.cryptotracker.ui.theme.secondaryDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.secondaryDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.secondaryLight
import com.plcoding.cryptotracker.ui.theme.secondaryLightHighContrast
import com.plcoding.cryptotracker.ui.theme.secondaryLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.surfaceBrightDark
import com.plcoding.cryptotracker.ui.theme.surfaceBrightDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.surfaceBrightDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.surfaceBrightLight
import com.plcoding.cryptotracker.ui.theme.surfaceBrightLightHighContrast
import com.plcoding.cryptotracker.ui.theme.surfaceBrightLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.surfaceContainerDark
import com.plcoding.cryptotracker.ui.theme.surfaceContainerDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.surfaceContainerDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.surfaceContainerHighDark
import com.plcoding.cryptotracker.ui.theme.surfaceContainerHighDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.surfaceContainerHighDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.surfaceContainerHighLight
import com.plcoding.cryptotracker.ui.theme.surfaceContainerHighLightHighContrast
import com.plcoding.cryptotracker.ui.theme.surfaceContainerHighLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.surfaceContainerHighestDark
import com.plcoding.cryptotracker.ui.theme.surfaceContainerHighestDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.surfaceContainerHighestDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.surfaceContainerHighestLight
import com.plcoding.cryptotracker.ui.theme.surfaceContainerHighestLightHighContrast
import com.plcoding.cryptotracker.ui.theme.surfaceContainerHighestLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.surfaceContainerLight
import com.plcoding.cryptotracker.ui.theme.surfaceContainerLightHighContrast
import com.plcoding.cryptotracker.ui.theme.surfaceContainerLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.surfaceContainerLowDark
import com.plcoding.cryptotracker.ui.theme.surfaceContainerLowDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.surfaceContainerLowDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.surfaceContainerLowLight
import com.plcoding.cryptotracker.ui.theme.surfaceContainerLowLightHighContrast
import com.plcoding.cryptotracker.ui.theme.surfaceContainerLowLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.surfaceContainerLowestDark
import com.plcoding.cryptotracker.ui.theme.surfaceContainerLowestDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.surfaceContainerLowestDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.surfaceContainerLowestLight
import com.plcoding.cryptotracker.ui.theme.surfaceContainerLowestLightHighContrast
import com.plcoding.cryptotracker.ui.theme.surfaceContainerLowestLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.surfaceDark
import com.plcoding.cryptotracker.ui.theme.surfaceDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.surfaceDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.surfaceDimDark
import com.plcoding.cryptotracker.ui.theme.surfaceDimDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.surfaceDimDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.surfaceDimLight
import com.plcoding.cryptotracker.ui.theme.surfaceDimLightHighContrast
import com.plcoding.cryptotracker.ui.theme.surfaceDimLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.surfaceLight
import com.plcoding.cryptotracker.ui.theme.surfaceLightHighContrast
import com.plcoding.cryptotracker.ui.theme.surfaceLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.surfaceVariantDark
import com.plcoding.cryptotracker.ui.theme.surfaceVariantDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.surfaceVariantDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.surfaceVariantLight
import com.plcoding.cryptotracker.ui.theme.surfaceVariantLightHighContrast
import com.plcoding.cryptotracker.ui.theme.surfaceVariantLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.tertiaryContainerDark
import com.plcoding.cryptotracker.ui.theme.tertiaryContainerDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.tertiaryContainerDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.tertiaryContainerLight
import com.plcoding.cryptotracker.ui.theme.tertiaryContainerLightHighContrast
import com.plcoding.cryptotracker.ui.theme.tertiaryContainerLightMediumContrast
import com.plcoding.cryptotracker.ui.theme.tertiaryDark
import com.plcoding.cryptotracker.ui.theme.tertiaryDarkHighContrast
import com.plcoding.cryptotracker.ui.theme.tertiaryDarkMediumContrast
import com.plcoding.cryptotracker.ui.theme.tertiaryLight
import com.plcoding.cryptotracker.ui.theme.tertiaryLightHighContrast
import com.plcoding.cryptotracker.ui.theme.tertiaryLightMediumContrast

private val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

private val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onErrorContainer = onErrorContainerLightMediumContrast,
    background = backgroundLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast,
    surfaceDim = surfaceDimLightMediumContrast,
    surfaceBright = surfaceBrightLightMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = surfaceContainerLowLightMediumContrast,
    surfaceContainer = surfaceContainerLightMediumContrast,
    surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,
    surfaceDim = surfaceDimLightHighContrast,
    surfaceBright = surfaceBrightLightHighContrast,
    surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
    surfaceContainerLow = surfaceContainerLowLightHighContrast,
    surfaceContainer = surfaceContainerLightHighContrast,
    surfaceContainerHigh = surfaceContainerHighLightHighContrast,
    surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
    surfaceDim = surfaceDimDarkMediumContrast,
    surfaceBright = surfaceBrightDarkMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
    surfaceContainer = surfaceContainerDarkMediumContrast,
    surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
    surfaceDim = surfaceDimDarkHighContrast,
    surfaceBright = surfaceBrightDarkHighContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
    surfaceContainerLow = surfaceContainerLowDarkHighContrast,
    surfaceContainer = surfaceContainerDarkHighContrast,
    surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
)

@Composable
fun CryptoTrackerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> highContrastDarkColorScheme
        else -> highContrastLightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}