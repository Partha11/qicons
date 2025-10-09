package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.GiftTop: ImageVector
    get() {
        if (_GiftTop != null) {
            return _GiftTop!!
        }
        _GiftTop = ImageVector.Builder(
            name = "Outlined.GiftTop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3.75f)
                verticalLineToRelative(16.5f)
                moveTo(2.25f, 12f)
                horizontalLineToRelative(19.5f)
                moveTo(6.375f, 17.25f)
                arcToRelative(4.875f, 4.875f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.875f, -4.875f)
                lineTo(11.25f, 12f)
                moveToRelative(6.375f, 5.25f)
                arcToRelative(4.875f, 4.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.875f, -4.875f)
                lineTo(12.75f, 12f)
                moveToRelative(-9f, 8.25f)
                horizontalLineToRelative(16.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, -1.5f)
                lineTo(21.75f, 5.25f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
                lineTo(3.75f, 3.75f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 1.5f)
                verticalLineToRelative(13.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 1.5f)
                close()
                moveTo(16.371f, 10.81f)
                curveToRelative(-1.409f, 1.41f, -4.242f, 1.061f, -4.242f, 1.061f)
                reflectiveCurveToRelative(-0.349f, -2.833f, 1.06f, -4.242f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.182f, 3.182f)
                close()
                moveTo(10.773f, 7.63f)
                curveToRelative(1.409f, 1.409f, 1.06f, 4.242f, 1.06f, 4.242f)
                reflectiveCurveTo(9f, 12.22f, 7.592f, 10.811f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3.182f, -3.182f)
                close()
            }
        }.build()

        return _GiftTop!!
    }

@Suppress("ObjectPropertyName")
private var _GiftTop: ImageVector? = null
