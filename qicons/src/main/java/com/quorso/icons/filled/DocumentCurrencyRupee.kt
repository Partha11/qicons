package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.DocumentCurrencyRupee: ImageVector
    get() {
        if (_DocumentCurrencyRupee != null) {
            return _DocumentCurrencyRupee!!
        }
        _DocumentCurrencyRupee = ImageVector.Builder(
            name = "Filled.DocumentCurrencyRupee",
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
                moveTo(9.75f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(0.375f)
                curveToRelative(0.769f, 0f, 1.43f, 0.463f, 1.719f, 1.125f)
                lineTo(9.75f, 13.125f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(2.094f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.719f, 1.125f)
                lineTo(9.75f, 15.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.53f, 1.28f)
                lineToRelative(2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, -1.06f)
                lineToRelative(-1.193f, -1.194f)
                arcToRelative(3.382f, 3.382f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.08f, -2.401f)
                horizontalLineToRelative(0.833f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-0.834f)
                arcTo(3.357f, 3.357f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.932f, 12f)
                horizontalLineToRelative(1.318f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                lineTo(10.5f, 10.5f)
                curveToRelative(-0.04f, 0f, -0.08f, 0.003f, -0.12f, 0.01f)
                arcToRelative(3.425f, 3.425f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.255f, -0.01f)
                lineTo(9.75f, 10.5f)
                close()
            }
        }.build()

        return _DocumentCurrencyRupee!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentCurrencyRupee: ImageVector? = null
