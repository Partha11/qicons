package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Bold: ImageVector
    get() {
        if (_Bold != null) {
            return _Bold!!
        }
        _Bold = ImageVector.Builder(
            name = "Outlined.Bold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.75f, 3.744f)
                horizontalLineToRelative(-0.753f)
                verticalLineToRelative(8.25f)
                horizontalLineToRelative(7.125f)
                arcToRelative(4.125f, 4.125f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -8.25f)
                lineTo(6.75f, 3.744f)
                close()
                moveTo(6.75f, 3.744f)
                verticalLineToRelative(0.38f)
                moveToRelative(0f, 16.122f)
                horizontalLineToRelative(6.747f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -9.001f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(0.753f)
                close()
                moveTo(6.75f, 20.246f)
                verticalLineToRelative(-0.37f)
                moveToRelative(0f, -15.751f)
                horizontalLineToRelative(6f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 7.5f)
                horizontalLineToRelative(-6f)
                moveToRelative(0f, -7.5f)
                verticalLineToRelative(7.5f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(8.25f)
                moveToRelative(0f, -8.25f)
                horizontalLineToRelative(6.375f)
                arcToRelative(4.125f, 4.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 8.25f)
                lineTo(6.75f, 19.875f)
                moveToRelative(0.747f, -15.38f)
                horizontalLineToRelative(4.875f)
                arcToRelative(3.375f, 3.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6.75f)
                lineTo(7.497f, 11.245f)
                verticalLineToRelative(-6.75f)
                close()
                moveTo(7.497f, 11.995f)
                horizontalLineToRelative(5.25f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 7.5f)
                horizontalLineToRelative(-5.25f)
                verticalLineToRelative(-7.5f)
                close()
            }
        }.build()

        return _Bold!!
    }

@Suppress("ObjectPropertyName")
private var _Bold: ImageVector? = null
