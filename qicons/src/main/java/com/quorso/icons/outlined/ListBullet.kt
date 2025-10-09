package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ListBullet: ImageVector
    get() {
        if (_ListBullet != null) {
            return _ListBullet!!
        }
        _ListBullet = ImageVector.Builder(
            name = "Outlined.ListBullet",
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
                moveTo(8.25f, 6.75f)
                horizontalLineToRelative(12f)
                moveTo(8.25f, 12f)
                horizontalLineToRelative(12f)
                moveToRelative(-12f, 5.25f)
                horizontalLineToRelative(12f)
                moveTo(3.75f, 6.75f)
                horizontalLineToRelative(0.007f)
                verticalLineToRelative(0.008f)
                lineTo(3.75f, 6.758f)
                lineTo(3.75f, 6.75f)
                close()
                moveTo(4.125f, 6.75f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0f)
                close()
                moveTo(3.75f, 12f)
                horizontalLineToRelative(0.007f)
                verticalLineToRelative(0.008f)
                lineTo(3.75f, 12.008f)
                lineTo(3.75f, 12f)
                close()
                moveTo(4.125f, 12f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0f)
                close()
                moveTo(3.75f, 17.25f)
                horizontalLineToRelative(0.007f)
                verticalLineToRelative(0.008f)
                lineTo(3.75f, 17.258f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(4.125f, 17.25f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0f)
                close()
            }
        }.build()

        return _ListBullet!!
    }

@Suppress("ObjectPropertyName")
private var _ListBullet: ImageVector? = null
