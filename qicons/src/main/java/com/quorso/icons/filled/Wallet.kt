package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.Wallet: ImageVector
    get() {
        if (_Wallet != null) {
            return _Wallet!!
        }
        _Wallet = ImageVector.Builder(
            name = "Filled.Wallet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.273f, 5.625f)
                arcTo(4.483f, 4.483f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.25f, 4.5f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.141f, 0f, 2.183f, 0.425f, 2.977f, 1.125f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.75f, 3f)
                horizontalLineTo(5.25f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.977f, 2.625f)
                close()
                moveTo(2.273f, 8.625f)
                arcTo(4.483f, 4.483f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.25f, 7.5f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.141f, 0f, 2.183f, 0.425f, 2.977f, 1.125f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.75f, 6f)
                horizontalLineTo(5.25f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.977f, 2.625f)
                close()
                moveTo(5.25f, 9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(13.5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineToRelative(-6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.5f, 0f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 9f)
                horizontalLineTo(5.25f)
                close()
            }
        }.build()

        return _Wallet!!
    }

@Suppress("ObjectPropertyName")
private var _Wallet: ImageVector? = null
