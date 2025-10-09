package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.DocumentCurrencyEuro: ImageVector
    get() {
        if (_DocumentCurrencyEuro != null) {
            return _DocumentCurrencyEuro!!
        }
        _DocumentCurrencyEuro = ImageVector.Builder(
            name = "Filled.DocumentCurrencyEuro",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.75f, 3.375f)
                curveToRelative(0f, -1.036f, 0.84f, -1.875f, 1.875f, -1.875f)
                lineTo(9f, 1.5f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.75f, 3.75f)
                verticalLineToRelative(1.875f)
                curveToRelative(0f, 1.036f, 0.84f, 1.875f, 1.875f, 1.875f)
                lineTo(16.5f, 9f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.75f, 3.75f)
                verticalLineToRelative(7.875f)
                curveToRelative(0f, 1.035f, -0.84f, 1.875f, -1.875f, 1.875f)
                lineTo(5.625f, 22.5f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.875f, -1.875f)
                lineTo(3.75f, 3.375f)
                close()
                moveTo(11.214f, 12.817f)
                curveToRelative(0.459f, -0.573f, 1.019f, -0.817f, 1.536f, -0.817f)
                curveToRelative(0.517f, 0f, 1.077f, 0.244f, 1.536f, 0.817f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.171f, -0.937f)
                curveToRelative(-0.713f, -0.892f, -1.689f, -1.38f, -2.707f, -1.38f)
                curveToRelative(-1.018f, 0f, -1.994f, 0.488f, -2.707f, 1.38f)
                arcToRelative(4.61f, 4.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.705f, 1.245f)
                lineTo(8.25f, 13.125f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(0.763f)
                curveToRelative(-0.017f, 0.25f, -0.017f, 0.5f, 0f, 0.75f)
                lineTo(8.25f, 15.375f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(1.088f)
                curveToRelative(0.17f, 0.449f, 0.406f, 0.87f, 0.705f, 1.245f)
                curveToRelative(0.713f, 0.892f, 1.689f, 1.38f, 2.707f, 1.38f)
                curveToRelative(1.018f, 0f, 1.994f, -0.488f, 2.707f, -1.38f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.171f, -0.937f)
                curveToRelative(-0.459f, 0.573f, -1.019f, 0.817f, -1.536f, 0.817f)
                curveToRelative(-0.517f, 0f, -1.077f, -0.244f, -1.536f, -0.817f)
                curveToRelative(-0.078f, -0.098f, -0.15f, -0.2f, -0.215f, -0.308f)
                horizontalLineToRelative(1.751f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-2.232f)
                arcToRelative(3.965f, 3.965f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -0.75f)
                horizontalLineToRelative(2.232f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                lineTo(11f, 13.125f)
                curveToRelative(0.065f, -0.107f, 0.136f, -0.21f, 0.214f, -0.308f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.25f, 5.25f)
                arcToRelative(5.23f, 5.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.279f, -3.434f)
                arcToRelative(9.768f, 9.768f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.963f, 6.963f)
                arcTo(5.23f, 5.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 7.5f)
                horizontalLineToRelative(-1.875f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.375f, -0.375f)
                verticalLineTo(5.25f)
                close()
            }
        }.build()

        return _DocumentCurrencyEuro!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentCurrencyEuro: ImageVector? = null
