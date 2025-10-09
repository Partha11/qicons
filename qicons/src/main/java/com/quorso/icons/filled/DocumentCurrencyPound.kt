package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.DocumentCurrencyPound: ImageVector
    get() {
        if (_DocumentCurrencyPound != null) {
            return _DocumentCurrencyPound!!
        }
        _DocumentCurrencyPound = ImageVector.Builder(
            name = "Filled.DocumentCurrencyPound",
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
                moveTo(14.25f, 5.25f)
                arcToRelative(5.23f, 5.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.279f, -3.434f)
                arcToRelative(9.768f, 9.768f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.963f, 6.963f)
                arcTo(5.23f, 5.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 7.5f)
                horizontalLineToRelative(-1.875f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.375f, -0.375f)
                lineTo(14.25f, 5.25f)
                close()
                moveTo(10.576f, 14.833f)
                arcToRelative(2.249f, 2.249f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.765f, -2.174f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, -1.06f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.076f, 15f)
                lineTo(8.25f, 15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(1.156f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.206f, 1.559f)
                lineToRelative(-0.156f, 0.439f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.042f, 0.923f)
                lineToRelative(0.439f, -0.22f)
                arcToRelative(2.113f, 2.113f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.613f, -0.115f)
                arcToRelative(3.613f, 3.613f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.758f, -0.196f)
                lineToRelative(0.44f, -0.22f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.671f, -1.341f)
                lineToRelative(-0.44f, 0.22f)
                arcToRelative(2.113f, 2.113f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.613f, 0.114f)
                arcToRelative(3.612f, 3.612f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.745f, -0.134f)
                curveToRelative(0.048f, -0.341f, 0.062f, -0.686f, 0.042f, -1.029f)
                lineTo(12f, 16.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-1.379f)
                lineToRelative(-0.045f, -0.167f)
                close()
            }
        }.build()

        return _DocumentCurrencyPound!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentCurrencyPound: ImageVector? = null
